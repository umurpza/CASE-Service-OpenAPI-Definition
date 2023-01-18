package controllers;

import apimodels.CFDocumentSetType;
import apimodels.CFDocumentType;
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
public abstract class DocumentsManagerApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getAllCFDocumentsHttp(Http.Request request,  @Min(1)Integer limit,  @Min(0)Integer offset, String sort, String orderBy, String filter, List<String> fields) throws Exception {
        CFDocumentSetType obj = getAllCFDocuments(request, limit, offset, sort, orderBy, filter, fields);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CFDocumentSetType getAllCFDocuments(Http.Request request,  @Min(1)Integer limit,  @Min(0)Integer offset, String sort, String orderBy, String filter, List<String> fields) throws Exception;

    public Result getCFDocumentHttp(Http.Request request, String sourcedId) throws Exception {
        CFDocumentType obj = getCFDocument(request, sourcedId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CFDocumentType getCFDocument(Http.Request request, String sourcedId) throws Exception;

}
