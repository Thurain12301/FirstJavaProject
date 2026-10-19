package org.example.oct19;
class A{
    public void show(){
        System.out.println("In A show");
    }
    class B{
        public void show1(){
            System.out.println("In B show");
        }

    }
}
public class InnerClassTest {
    static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj. new B();
        obj1.show1();

    }

}
