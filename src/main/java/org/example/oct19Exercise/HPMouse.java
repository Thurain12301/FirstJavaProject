package org.example.oct19Exercise;

public class HPMouse extends Mouse{
    @Override
    public void LeftClick() {
        System.out.println("It is Hp Mouse leftClick");

    }

    @Override
    public void RightClick() {
        System.out.println("It is Hp mouse rightclick");

    }

    @Override
    public void Move() {
        System.out.println("It is Hp mouse move");

    }

    @Override
    public void Scroll() {
        System.out.println("It is Hp mouse scroll");

    }
}
