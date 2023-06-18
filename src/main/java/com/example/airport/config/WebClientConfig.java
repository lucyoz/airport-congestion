package com.example.airport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.DefaultUriBuilderFactory.EncodingMode;

@Configuration
public class WebClientConfig {
  private final static String BASE_URL = "http://apis.data.go.kr";

  @Bean
  public WebClient webClient(){

    DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory(BASE_URL);
    factory.setEncodingMode(EncodingMode.VALUES_ONLY);

    return WebClient.builder()
        .uriBuilderFactory(factory)
        .baseUrl(BASE_URL)
        .build();
  }
}
