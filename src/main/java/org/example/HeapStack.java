package org.example;

class Caculator1 {

    int num = 5;
    public  int add(int n1, int n2){

        return n1 + n2;
    }

}
public class HeapStack {
    int data = 10;

    static void main(String[] args) {
        Caculator1 obj = new Caculator1();
        Caculator1 obj1= new Caculator1();

        int r1 = obj.add(3,4);
        obj.num = 8;


        System.out.println(obj.num);
        System.out.println(obj1.num);


    }
}
