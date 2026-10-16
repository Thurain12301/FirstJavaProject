package org.example.oct14;

class Person {

    String name;
    int age;

    public void walk() {

        System.out.println(name + " is walking to work");
    }
}

class Employee extends Person {
        double salary;

        public void work(){

            System.out.println(name+" is writing code and earn Salary$ :" + salary);
        }
    }



public class SuperClassTest {

    static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Aung Aung";
        emp.age = 32;
        emp.walk();

        emp.salary = 520000;
        emp.work();

    }
}
