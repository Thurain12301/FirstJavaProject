package org.example;

class Human{

    private int age;
    private String name;

    public Human(){

        this.age = 30;
        this.name= "Aung Aung";

    }
    public int getAge(){

        return age;
    }
    public String getName(){

        return name;
    }

    public void  setAge(int age){
        this.age = age;
    }
    public void setName(String name){

        this.name = name;
    }
}
public class Constructor {
    static void main(String[] args) {

        Human obj = new Human();
        System.out.println(obj.getName() +":"+ obj.getAge());

    }
}
