package com.spartaglobal.collectionexamples;

import java.util.HashSet;
import java.util.Set;

public class ExampleSets {

    //unordered list

    private Set<String> newSet= new HashSet<String>();

    public void workingWithOurSet(){
        newSet.add("cheese");
        newSet.add("beer");
        newSet.add("bread");
    }

    public void printSet(){
        System.out.println(newSet.contains("bread"));

        for (String shoppingItem: newSet){
            System.out.println(shoppingItem);
        }
    }
}
