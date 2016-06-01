package com.ck.bdd.steps;

import org.jbehave.core.annotations.When;

public class LongTasks {

    @When("the execution lasts $seconds seconds")
    public void sleepSomeSeconds(int seconds ){
        try {
            Thread.sleep( seconds*1000 );
        } catch ( InterruptedException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
