package com.spartaglobal.collectionexamples;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueues {

    private Queue<String>stringQueue=new LinkedList<>();

    public ExampleQueues() {
        stringQueue.add("one");
        stringQueue.add("two");
        stringQueue.add("three");
    }

    public void queueRunner(){
        stringQueue.peek();
        stringQueue.poll();
        stringQueue.remove();

        for(String itemInQueue: stringQueue){
            System.out.println(itemInQueue);
        }
    }
}
