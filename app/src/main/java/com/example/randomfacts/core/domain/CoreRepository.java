package com.example.randomfacts.core.domain;

import com.example.randomfacts.core.data.DataSource;

import java.util.HashMap;

public class CoreRepository {
    DataSource dataSource;
    public CoreRepository(DataSource dataSource){
        this.dataSource = dataSource;
    }

    FactEntity getRandom() throws Exception {
        return dataSource.fetchFact(new HashMap());
    };
}
