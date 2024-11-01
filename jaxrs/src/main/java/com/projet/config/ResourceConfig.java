package com.projet.config;

import com.projet.controllers.CompteJaxRSAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConfig {
    @Bean(name = "customResourceConfig")
    public org.glassfish.jersey.server.ResourceConfig resourceConfig() {

        org.glassfish.jersey.server.ResourceConfig jerseyServlet = new org.glassfish.jersey.server.ResourceConfig();
        jerseyServlet.register(CompteJaxRSAPI.class);
        return jerseyServlet;
    }

}
