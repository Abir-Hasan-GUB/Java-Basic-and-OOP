
package OOP.This_Keyword;

/**
 *
 * @author Abir Hasan
 */
public class Person {
    String name;
    int age;
    String hairColor;
    
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    Person(String name, int age,String hairColor){
        this(name,age);/*
        Similer to Super keyword.
        dicler in first step
        if parameter avilable 
        then write parameter for pass thes.
        */
        this.hairColor = hairColor;
    }
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("HairColor: "+hairColor);
        System.out.println("\n");
    }
}
