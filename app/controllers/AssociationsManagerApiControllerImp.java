package controllers;

import apimodels.CFAssociationSetType;
import apimodels.CFAssociationType;
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
public class AssociationsManagerApiControllerImp extends AssociationsManagerApiControllerImpInterface {
    @Override
    public CFAssociationType getCFAssociation(Http.Request request, String sourcedId) throws Exception {
        //Do your magic!!!
        return new CFAssociationType();
    }

    @Override
    public CFAssociationSetType getCFItemAssociations(Http.Request request, String sourcedId) throws Exception {
        //Do your magic!!!
        return new CFAssociationSetType();
    }

}
