package com.udemy.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class CalculationService {
    private DataService dataService;

    public CalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
