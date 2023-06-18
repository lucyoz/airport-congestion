package com.example.airport.controller;

import com.example.airport.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ApiController {

  private final ApiService apiService;

  @GetMapping("/t1")
  public String getData() {
    String data = apiService.getData();

    return data;
  }
}
