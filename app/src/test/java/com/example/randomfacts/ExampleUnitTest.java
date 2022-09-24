package com.example.randomfacts;

import org.junit.Test;
import static org.junit.Assert.*;


import com.example.randomfacts.core.data.DataSource;
import com.example.randomfacts.core.domain.FactEntity;
import com.example.randomfacts.core.utils.OkClient;

import java.util.HashMap;


public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getFact() {

        DataSource remote = new DataSource(new OkClient());
        try {
            FactEntity res = remote.fetchFact(new HashMap());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}