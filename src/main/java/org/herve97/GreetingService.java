package org.herve97;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    @PostConstruct
    public void init(){}

    @Timed
    public String getGreetingTemplate(String language){
        String result = "Hello %s";
        switch (language){
            case "fr": result = "Bonjour %s"; break;
            case "de": result = "Willkomen %s"; break;
            case "es": result = "Hola %s %s"; break;
            case "it": result = "Bonjourno %s %s"; break;
            case "pt": result = "Bondia %s %s"; break;
            default: result = "Hello %s";
        }
        return result;
    }

}
