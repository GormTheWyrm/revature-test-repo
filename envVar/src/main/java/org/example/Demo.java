package org.example;

import java.io.FileReader;
import java.util.Properties;

import static java.lang.System.getenv;

public class Demo {

    public static void main(String[] args) {
        System.out.println("pre try");
        try{
            System.out.println("try");
            FileReader reader=new FileReader("resources/db.properties");

            Properties p=new Properties();
            p.load(reader);

            System.out.println(p.getProperty("one"));
            System.out.println(p.getProperty("two"));

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("post try");
    }


}
