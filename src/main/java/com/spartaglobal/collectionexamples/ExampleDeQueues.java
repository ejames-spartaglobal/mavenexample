package com.spartaglobal.collectionexamples;

import java.util.Deque;
import java.util.LinkedList;

public class ExampleDeQueues {

    private Deque<String> carPark = new LinkedList<>();

    public ExampleDeQueues() {
        carPark.add("car1");
        carPark.add("car2");
        carPark.add("car3");
        carPark.add("car4");
        carPark.add("car5");

    }

    public void workingWithOurDequeue(){
        for(String car: carPark){
            System.out.println(car);
        }


    }
}
