package com.codsbiz.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Value("${spring.web.resources.static-locations}")
    private String resourceLocations;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/index.html", "/favicon.ico", "/icons/**", "/assets/**")
                .addResourceLocations(resourceLocations, resourceLocations + "icons/", resourceLocations + "assets/");
    }
}
