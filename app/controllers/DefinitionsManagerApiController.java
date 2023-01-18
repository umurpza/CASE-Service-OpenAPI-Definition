package controllers;

import apimodels.CFAssociationGroupingType;
import apimodels.CFConceptSetType;
import apimodels.CFItemTypeSetType;
import apimodels.CFLicenseType;
import apimodels.CFSubjectSetType;
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
public class DefinitionsManagerApiController extends Controller {
    private final DefinitionsManagerApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private DefinitionsManagerApiController(Config configuration, DefinitionsManagerApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getCFAssociationGrouping(Http.Request request, String sourcedId) throws Exception {
        return imp.getCFAssociationGroupingHttp(request, sourcedId);
    }

    @ApiAction
    public Result getCFConcept(Http.Request request, String sourcedId) throws Exception {
        return imp.getCFConceptHttp(request, sourcedId);
    }

    @ApiAction
    public Result getCFItemType(Http.Request request, String sourcedId) throws Exception {
        return imp.getCFItemTypeHttp(request, sourcedId);
    }

    @ApiAction
    public Result getCFLicense(Http.Request request, String sourcedId) throws Exception {
        return imp.getCFLicenseHttp(request, sourcedId);
    }

    @ApiAction
    public Result getCFSubject(Http.Request request, String sourcedId) throws Exception {
        return imp.getCFSubjectHttp(request, sourcedId);
    }

}
