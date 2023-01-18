package controllers;

import apimodels.CFPackageType;
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
public class PackagesManagerApiControllerImp extends PackagesManagerApiControllerImpInterface {
    @Override
    public CFPackageType getCFPackage(Http.Request request, String sourcedId) throws Exception {
        //Do your magic!!!
        return new CFPackageType();
    }

}
