package com.example.acer.drugeliminator;

/**
 * Created by ACER on 11/29/2017.
 */
public class Model{
    String name;
    int value; /* 0 -&gt; checkbox disable, 1 -&gt; checkbox enable */

    Model(String name, int value){
        this.name = name;
        this.value = value;
    }
    public String getName(){
        return this.name;
    }
    public String getValue(){
        return String.valueOf(this.value);
    }

    public void setValue(int val){
        this.value = val;
    }

}
