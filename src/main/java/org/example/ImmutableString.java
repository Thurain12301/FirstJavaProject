package org.example;

public class ImmutableString {

    static void main(String[] args) {

        
        String name = new String("Navan");
        name = name + "Riddy";


        String s1 = "Navan";
        String s2 = "Navan";

        System.out.println(name);
        System.out.println(s1 == s2);
    }
}
