package org.example.oct19Exercise;

import java.lang.management.MonitorInfo;

public class MouseMain {
    static void main(String[] args) {
        Mouse mouse = new DellMouse();
        Mouse mouse1 = new HPMouse();

        mouse.LeftClick();
        mouse.RightClick();
        mouse.Move();
        mouse.Scroll();
        DellMouse mouse2 = new DellMouse();
        mouse2.moreComfort();

        mouse1.RightClick();
        mouse1.LeftClick();
        mouse1.Move();
        mouse1.Scroll();

    }
}