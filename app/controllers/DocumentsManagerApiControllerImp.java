package controllers;

import apimodels.CFDocumentSetType;
import apimodels.CFDocumentType;
import apimodels.ImsxStatusInfoType;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
public class DocumentsManagerApiControllerImp extends DocumentsManagerApiControllerImpInterface {
    @Override
    public CFDocumentSetType getAllCFDocuments(Http.Request request,  @Min(1)Integer limit,  @Min(0)Integer offset, String sort, String orderBy, String filter, List<String> fields) throws Exception {
        //Do your magic!!!
        return new CFDocumentSetType();
    }

    @Override
    public CFDocumentType getCFDocument(Http.Request request, String sourcedId) throws Exception {
        //Do your magic!!!
        return new CFDocumentType();
    }

}
