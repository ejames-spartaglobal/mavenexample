package com.spartaglobal;

import com.spartaglobal.collectionexamples.ExampleDeQueues;
import com.spartaglobal.collectionexamples.ExampleLists;
import com.spartaglobal.collectionexamples.ExampleQueues;
import com.spartaglobal.collectionexamples.ExampleSets;
import com.spartaglobal.maps.ExampleMaps;
import com.spartaglobal.mavenexample.JavaAPIExamples;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        System.out.println( "Hello World!");
//        JavaAPIExamples javaAPIExamples = new JavaAPIExamples();
//        javaAPIExamples.mathExample();
//        javaAPIExamples.dateTimes();
//
//        ExampleSets exampleSets = new ExampleSets();
//        exampleSets.workingWithOurSet();
//        exampleSets.printSet();
//        ExampleLists exampleLists =new ExampleLists();
//        exampleLists.printList();
        ExampleQueues exampleQueues = new ExampleQueues();
        exampleQueues.queueRunner();
        ExampleDeQueues exampleDeQueues = new ExampleDeQueues();
        exampleDeQueues.workingWithOurDequeue();
        ExampleMaps exampleMaps = new ExampleMaps();
        System.out.println(exampleMaps.returnValue(2));
        exampleMaps.loopThroughMap();
    }
}
