package org.example.oct19;

abstract class Car {
    public abstract void drive();

    public void PlayMusic() {

        System.out.println("play music");
    }
}
class WagonR extends Car{
    @Override
    public void drive() {
        System.out.println("it is driving");
    }

}

public class AbstractTest1 {
    static void main(String[] args) {

        Car obj = new WagonR();
        obj.drive();
        obj.PlayMusic();
    }


}
