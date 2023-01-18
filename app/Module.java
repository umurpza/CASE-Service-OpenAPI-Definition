import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(AssociationsManagerApiControllerImpInterface.class).to(AssociationsManagerApiControllerImp.class);
        bind(DefinitionsManagerApiControllerImpInterface.class).to(DefinitionsManagerApiControllerImp.class);
        bind(DocumentsManagerApiControllerImpInterface.class).to(DocumentsManagerApiControllerImp.class);
        bind(ItemsManagerApiControllerImpInterface.class).to(ItemsManagerApiControllerImp.class);
        bind(PackagesManagerApiControllerImpInterface.class).to(PackagesManagerApiControllerImp.class);
        bind(RubricsManagerApiControllerImpInterface.class).to(RubricsManagerApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}