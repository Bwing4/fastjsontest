package com.sunieve.project.fasjsontest;

import java.util.Properties;

public class User {
    private String name;

    private Properties properties;

    public String getName() {
        System.out.println("getName is running ...");
        return name;
    }

    public void setName(String name) {
        System.out.println("setName is running ...");
        this.name = name;
    }


//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                '}';
//    }

    public Properties getProperties(){
        try{
            Runtime.getRuntime().exec("open -a safari");        //打开safari
        } catch (Exception e){
            e.printStackTrace();
        }
        return properties;
    }
}