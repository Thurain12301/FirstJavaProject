package org.example.ooptest;

import java.util.Scanner;


public class OopExercise{

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Id :");
        int id = scanner.nextInt();
        emp.setId(id);
        scanner.nextLine();

        System.out.print("Enter Name :");
        String name = scanner.nextLine();
        emp.setName(name);

        System.out.print("Enter Department :");
        String dept = scanner.nextLine();
        emp.setDept(dept);

        System.out.print("Enter Monthly Income :" );
        double income = scanner.nextDouble();
        emp.setDailyIncome(income);

        double salary = emp.calculateSalary();
        System.out.println("Salary is "+ salary);

    }


}