package org.example.oct19Exercise;

public class DellMouse extends Mouse {

    public void moreComfort(){
        System.out.println("It is Dell mouse more expensive");
    }

    @Override
    public void LeftClick() {
        System.out.println("It is Dell mouse LeftClick");
    }

    @Override
    public void RightClick() {
        System.out.println("It is right Dell mouse click");

    }

    @Override
    public void Move() {
        System.out.println("It is Dell mouse move");

    }

    @Override
    public void Scroll() {
        System.out.println("It is Dell mouse scroll");

    }

}
