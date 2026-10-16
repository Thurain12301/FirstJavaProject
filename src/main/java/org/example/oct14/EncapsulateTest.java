package org.example.oct14;

public class EncapsulateTest {

    
    static class Human {
        private String name;
        private int age;


        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }


        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Human obj = new Human();
        obj.name = "Abc";

        obj.setName("Reddy");
        obj.setAge(30);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}