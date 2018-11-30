package com.ideacode.arca;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by randysu on 2018/11/28.
 */

@SpringBootApplication
public class AcraApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(AcraApplication.class, args);
//    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AcraApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(AcraApplication.class, args);
    }

}
