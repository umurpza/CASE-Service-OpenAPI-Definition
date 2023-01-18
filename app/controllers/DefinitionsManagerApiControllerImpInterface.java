package controllers;

import apimodels.CFAssociationGroupingType;
import apimodels.CFConceptSetType;
import apimodels.CFItemTypeSetType;
import apimodels.CFLicenseType;
import apimodels.CFSubjectSetType;
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
public abstract class DefinitionsManagerApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getCFAssociationGroupingHttp(Http.Request request, String sourcedId) throws Exception {
        CFAssociationGroupingType obj = getCFAssociationGrouping(request, sourcedId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CFAssociationGroupingType getCFAssociationGrouping(Http.Request request, String sourcedId) throws Exception;

    public Result getCFConceptHttp(Http.Request request, String sourcedId) throws Exception {
        CFConceptSetType obj = getCFConcept(request, sourcedId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CFConceptSetType getCFConcept(Http.Request request, String sourcedId) throws Exception;

    public Result getCFItemTypeHttp(Http.Request request, String sourcedId) throws Exception {
        CFItemTypeSetType obj = getCFItemType(request, sourcedId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CFItemTypeSetType getCFItemType(Http.Request request, String sourcedId) throws Exception;

    public Result getCFLicenseHttp(Http.Request request, String sourcedId) throws Exception {
        CFLicenseType obj = getCFLicense(request, sourcedId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CFLicenseType getCFLicense(Http.Request request, String sourcedId) throws Exception;

    public Result getCFSubjectHttp(Http.Request request, String sourcedId) throws Exception {
        CFSubjectSetType obj = getCFSubject(request, sourcedId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CFSubjectSetType getCFSubject(Http.Request request, String sourcedId) throws Exception;

}
