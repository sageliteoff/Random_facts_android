package com.example.randomfacts.core;

import android.app.Application;

import com.example.randomfacts.core.data.DataSource;
import com.example.randomfacts.core.domain.CoreRepository;
import com.example.randomfacts.core.domain.GetRandomFactUseCase;
import com.example.randomfacts.core.domain.UseCase;
import com.example.randomfacts.core.utils.Client;
import com.example.randomfacts.core.utils.OkClient;
import com.example.randomfacts.home.HomeController;


public class ServiceLocator  extends Application {


    public  HomeController homeController;

    public ServiceLocator(){
        Client client =  new OkClient();
        DataSource dataSource = new DataSource(client);

        CoreRepository coreRepository = new CoreRepository(dataSource);
        GetRandomFactUseCase getRandomFactUseCase = new GetRandomFactUseCase(coreRepository);

       homeController = new HomeController(getRandomFactUseCase);
    }



}
