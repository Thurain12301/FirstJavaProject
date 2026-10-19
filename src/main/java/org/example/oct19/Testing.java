package org.example.oct19;

public class Testing {

    static void main() {
        FunctionalInterface functionalInterface = () ->{
          System.out.println("HELLO from functionl" );
        };

        functionalInterface.print();
    }


}

interface FunctionalInterface{
    void print();
}
