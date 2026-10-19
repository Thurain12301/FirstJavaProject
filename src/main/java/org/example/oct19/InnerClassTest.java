package org.example.oct19;
class A1{
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
        A1 obj = new A1();
        obj.show();

        A1.B obj1 = obj. new B();
        obj1.show1();

    }

}
