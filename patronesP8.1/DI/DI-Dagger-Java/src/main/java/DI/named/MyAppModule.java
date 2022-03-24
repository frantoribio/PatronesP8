package DI.named;

import dagger.Module;
import dagger.Provides;
import model.named.AppCollaborator;
import model.named.IApiService;
import model.named.IAppCollaborator;
import model.named.services.ApiServiceProduction;
import model.named.services.ApiServiceTest;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class MyAppModule {

    // Si queremos que sea Singletonm podemos usar @Singleton
    // aquí o en la clase
    // Si lo ponemos en la clase es para todas
    // Si lo ponemos aquí es para este contexto
    @Provides
    IAppCollaborator provideAppCollaborator() {
        return new AppCollaborator();
    }

    /**
     * En ocasiones necesitaremos inyectar distintas implementaciones
     * de un interface por lo que usaremos varios métodos @Provides
     * anotándolos con @Named
     */
    @Provides
    @Singleton
    @Named("Production")
    IApiService provideApiProductionService() {
        return new ApiServiceProduction();
    }

    @Provides
    @Singleton
    @Named("Test")
    IApiService provideApiTestService() {
        return new ApiServiceTest();
    }
}
