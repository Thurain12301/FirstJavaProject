package org.example.oct19Exercise;

public class HPMouse extends Mouse{
    @Override
    public void LeftClick() {
        System.out.println("It is leftClick");

    }

    @Override
    public void RightClick() {
        System.out.println("It is rightclick");

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
