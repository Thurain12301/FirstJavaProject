package org.example.oct19Exercise;

public class DellMouse extends Mouse {

    public void moreComfort(){
        System.out.println("It is more expensive");
    }

    @Override
    public void LeftClick() {
        System.out.println("It is LeftClick");
    }

    @Override
    public void RightClick() {
        System.out.println("It is right click");

    }

    @Override
    public void Move() {
        System.out.println("It is move");

    }

    @Override
    public void Scroll() {
        System.out.println("It is scroll");

    }

}
