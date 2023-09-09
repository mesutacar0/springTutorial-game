package com.udemy.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MongoDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] { 10, 14, 25, 55 };
    }

}
