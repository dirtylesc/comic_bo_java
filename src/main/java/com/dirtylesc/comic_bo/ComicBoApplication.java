package com.dirtylesc.comic_bo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ComicBoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComicBoApplication.class, args);
    }

}
