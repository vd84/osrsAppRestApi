package com.douglashammarstam.plantAppRestAPI;

import com.douglashammarstam.plantAppRestAPI.Models.GrandExchangeHelper;
import com.douglashammarstam.plantAppRestAPI.Models.StatApiFetcher;
import com.douglashammarstam.plantAppRestAPI.Models.Stats;
import com.douglashammarstam.plantAppRestAPI.Services.GrandExchangeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@EnableJpaRepositories("com.douglashammarstam.plantAppRestAPI.*")
@ComponentScan(basePackages = { "com.douglashammarstam.plantAppRestAPI.*" })
@EntityScan("com.douglashammarstam.plantAppRestAPI.*")
@SpringBootApplication
public class PlantAppRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlantAppRestApiApplication.class, args);

        GrandExchangeService grandExchangeService = new GrandExchangeService();

        try {
            grandExchangeService.getAllItems();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
