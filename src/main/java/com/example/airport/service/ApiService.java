package com.example.airport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ApiService {

  @Autowired
  private WebClient webClient;

  @Value("${api.key.encoding}")
  private String APIEncodingKey;

  public String getData(){

    String response = webClient.get()
        .uri(uriBuilder -> uriBuilder
          .path(String.format("/B551177/PassengerNoticeKR/getfPassengerNoticeIKR"))
          .queryParam("serviceKey", APIEncodingKey)
          .queryParam("selectdate","0")
           .queryParam("type","json").build())
        .retrieve().bodyToMono(String.class).block();

    return response;

  }


}
