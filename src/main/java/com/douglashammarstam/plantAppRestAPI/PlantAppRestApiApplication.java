package com.douglashammarstam.plantAppRestAPI;

import com.douglashammarstam.plantAppRestAPI.Models.*;
import com.douglashammarstam.plantAppRestAPI.Services.GrandExchangeService;
import com.douglashammarstam.plantAppRestAPI.Services.OsrsItemService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.TimeZone;

@EnableJpaRepositories("com.douglashammarstam.plantAppRestAPI.*")
@ComponentScan(basePackages = {"com.douglashammarstam.plantAppRestAPI.*"})
@EntityScan("com.douglashammarstam.plantAppRestAPI.*")
@SpringBootApplication
public class PlantAppRestApiApplication {

    public static void main(String[] args) throws IOException, ParseException, NoSuchFieldException, IllegalAccessException {
        SpringApplication.run(PlantAppRestApiApplication.class, args);


        OsrsMonsterFetcher osrsMonsterFetcher = new OsrsMonsterFetcher();

        }


}





















