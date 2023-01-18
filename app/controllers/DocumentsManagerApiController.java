package controllers;

import apimodels.CFDocumentSetType;
import apimodels.CFDocumentType;
import apimodels.ImsxStatusInfoType;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
public class DocumentsManagerApiController extends Controller {
    private final DocumentsManagerApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private DocumentsManagerApiController(Config configuration, DocumentsManagerApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getAllCFDocuments(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 100;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = 0;
        }
        String valuesort = request.getQueryString("sort");
        String sort;
        if (valuesort != null) {
            sort = valuesort;
        } else {
            sort = null;
        }
        String valueorderBy = request.getQueryString("orderBy");
        String orderBy;
        if (valueorderBy != null) {
            orderBy = valueorderBy;
        } else {
            orderBy = null;
        }
        String valuefilter = request.getQueryString("filter");
        String filter;
        if (valuefilter != null) {
            filter = valuefilter;
        } else {
            filter = null;
        }
        String[] fieldsArray = request.queryString().get("fields");
        List<String> fieldsList = OpenAPIUtils.parametersToList("csv", fieldsArray);
        List<String> fields = new ArrayList<>();
        for (String curParam : fieldsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                fields.add(curParam);
            }
        }
        return imp.getAllCFDocumentsHttp(request, limit, offset, sort, orderBy, filter, fields);
    }

    @ApiAction
    public Result getCFDocument(Http.Request request, String sourcedId) throws Exception {
        return imp.getCFDocumentHttp(request, sourcedId);
    }

}
