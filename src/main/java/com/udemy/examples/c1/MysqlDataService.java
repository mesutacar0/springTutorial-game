package com.udemy.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MysqlDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] { 10, 5, 1, 555 };
    }

}
