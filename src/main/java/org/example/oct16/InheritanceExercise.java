package org.example.oct16;

import java.util.Scanner;

public class InheritanceExercise {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Name :");
        String name = scanner.nextLine();


        System.out.print("Enter Id:");
        int id = scanner.nextInt();


        Employee ep = new Employee(id, name);
        scanner.nextLine();
        System.out.print("Enter DepartMent: ");
        String dept = scanner.nextLine();
        ep.setDepart(dept);

        System.out.print("Enter Daily Income :");
        int income = scanner.nextInt();
        ep.setDailyIncome(income);
        double salary = ep.CalculateSalary();

        System.out.println("Salary" +salary);
        System.out.println(ep);
        ep.speak();
    }
}
