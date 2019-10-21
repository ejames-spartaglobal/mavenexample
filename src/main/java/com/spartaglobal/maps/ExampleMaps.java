package com.spartaglobal.maps;

import javafx.scene.effect.Bloom;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExampleMaps {
    private Map<Integer, String> studentsInClass= new HashMap<>();

    public ExampleMaps(){
        studentsInClass.put(1,"Ed");
        studentsInClass.put(2,"nik");
    }

    public String returnValue(int keyNum){
        return studentsInClass.get(keyNum);
    }

    public void loopThroughMap(){
        Collection<String> values = studentsInClass.values();
        for(String data: values){
            System.out.println(data);
        }

        studentsInClass.keySet();
    }


}
