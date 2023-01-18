package controllers;

import apimodels.CFAssociationGroupingType;
import apimodels.CFConceptSetType;
import apimodels.CFItemTypeSetType;
import apimodels.CFLicenseType;
import apimodels.CFSubjectSetType;
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
public class DefinitionsManagerApiControllerImp extends DefinitionsManagerApiControllerImpInterface {
    @Override
    public CFAssociationGroupingType getCFAssociationGrouping(Http.Request request, String sourcedId) throws Exception {
        //Do your magic!!!
        return new CFAssociationGroupingType();
    }

    @Override
    public CFConceptSetType getCFConcept(Http.Request request, String sourcedId) throws Exception {
        //Do your magic!!!
        return new CFConceptSetType();
    }

    @Override
    public CFItemTypeSetType getCFItemType(Http.Request request, String sourcedId) throws Exception {
        //Do your magic!!!
        return new CFItemTypeSetType();
    }

    @Override
    public CFLicenseType getCFLicense(Http.Request request, String sourcedId) throws Exception {
        //Do your magic!!!
        return new CFLicenseType();
    }

    @Override
    public CFSubjectSetType getCFSubject(Http.Request request, String sourcedId) throws Exception {
        //Do your magic!!!
        return new CFSubjectSetType();
    }

}
