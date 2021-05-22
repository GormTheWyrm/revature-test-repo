package models;

public class Hello {
private String message;
public Hello(){
    System.out.println("no param constructor");
}
    public Hello(String message){
        System.out.println("ONE param constructor called with message "+ message);
        this.message = message;
    }
//    property with name and msg in .xml file... inside of a bean class in that file
//Employee ->(Address) ->List<Project>
}
