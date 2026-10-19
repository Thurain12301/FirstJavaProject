package org.example.oct19Exercise;

public abstract class Mouse {

    private String leftClick;
    private String rightClick;
    private String middleScroll;


    public abstract void LeftClick();
    public abstract void RightClick();
    public abstract void Move();
    public abstract void Scroll();


}
