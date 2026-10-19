package org.example.oct19;
interface Computer{

    void show();
}
class laptop implements Computer {

    public void show() {

        System.out.println("code ,run,compile");
    }
}
class desktop implements Computer{
        public void show(){

            System.out.println("code ,run,compile,faster");
        }

}
class developer{
    public void devApp(Computer comp){

        comp.show();
    }
}



public class InterfaceTest1 {
    static void main(String[] args) {
        laptop lap = new laptop();
        desktop desk= new desktop();

        developer dev = new developer();
        dev.devApp(desk);
        dev.devApp(lap);
    }
}
