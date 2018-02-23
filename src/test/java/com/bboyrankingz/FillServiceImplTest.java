package com.bboyrankingz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FillServiceImplTest {

    private final Fill fill = new Fill();
    private final FillServiceImpl fillService = new FillServiceImpl(fill);


    @Before
    public void setUp(){
        fillService.record(0L, 0L, "gilou");
        fillService.record(0L, 0L, "toto");
        fillService.record(0L, 0L, "titi");
        fillService.record(0L, 1L, "joe");
    }

    @Test
    public void should_have_titi_and_tata_in_gilou_fill() {
        Assert.assertEquals(fillService.get("gilou"), "[\"toto\",\"titi\"]");
    }

}