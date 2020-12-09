package com.example.gsontojson;

import javax.xml.transform.sax.SAXResult;

public class userInfo {
    public String name ;
    public int Age ;
    public String email ;

    public void info(String fName , String fEmail , int age){
        this.Age = age ;
        this.email = fEmail ;
        this.name = fName ;
    }
}
