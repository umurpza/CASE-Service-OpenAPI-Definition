package controllers;

import apimodels.CFAssociationSetType;
import apimodels.CFAssociationType;
import apimodels.ImsxStatusInfoType;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public abstract class AssociationsManagerApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getCFAssociationHttp(Http.Request request, String sourcedId) throws Exception {
        CFAssociationType obj = getCFAssociation(request, sourcedId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CFAssociationType getCFAssociation(Http.Request request, String sourcedId) throws Exception;

    public Result getCFItemAssociationsHttp(Http.Request request, String sourcedId) throws Exception {
        CFAssociationSetType obj = getCFItemAssociations(request, sourcedId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CFAssociationSetType getCFItemAssociations(Http.Request request, String sourcedId) throws Exception;

}
