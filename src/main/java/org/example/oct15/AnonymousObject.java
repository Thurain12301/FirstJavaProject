package org.example.oct15;


class A{

    public A(){

        System.out.println("Object is created");
    }
    public void show(){
        System.out.println("in A show");
    }
}
public class AnonymousObject {
    static void main(String[] args) {

        new A().show();
    }

}
