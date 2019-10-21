package com.spartaglobal.collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleLists {

    private List<String> hobbies = new ArrayList<String>();

    public ExampleLists(){
       workingWithOurList();
    }

    public void workingWithOurList(){
        hobbies.add("Football");
        hobbies.add("Gaming");
        hobbies.add("Cooking");
    }

    public void printList(){
        System.out.println("We're using the Iterator...");

        for (String element : hobbies) {
            System.out.println(element);
        }
    }
}
