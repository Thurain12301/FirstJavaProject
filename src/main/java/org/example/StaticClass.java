package org.example;

class Mobile{

    String name;
    int price;
    String type;

    public void show(){

        System.out.println(name  + " :" + price + " : " + type+" : " );

    }
    public static void show1(Mobile obj){

        System.out.println(obj.name  + " :" + obj.price + " : " + obj.type+" : " );
    }
}
public class StaticClass {
    static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.name = "Apple";
        obj1.price= 12000;
        obj1.type = "Smart";

        Mobile obj2= new Mobile();
        obj2.name = "Samaung";
        obj2.price=12000;
        obj2.type = "Smart";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
        Mobile.show1(obj2);




    }
}
