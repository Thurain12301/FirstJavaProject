package org.example.oct16;

public class Employee extends Person {

    private String depart;
    private int DailyIncome;
    final private double DayInMonth = 30;
    private double MonthlyIncome;

    public String getDepart() {
        return depart;
    }

    public int getDailyIncome() {
        return DailyIncome;
    }

    public double getMonthlyIncome() {
        return MonthlyIncome;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public void setDailyIncome(int dailyIncome) {
        DailyIncome = dailyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        MonthlyIncome = monthlyIncome;
    }

    public Employee(int id, String name) {

        super(id, name);


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + super.getName() +
                "id =" + super.getId() +
                "depart='" + depart + '\'' +
                ", DailyIncome=" + DailyIncome +
                ", DayInMonth=" + DayInMonth +
                ", MonthlyIncome=" + MonthlyIncome +
                '}';
    }

    public double CalculateSalary() {

        return this.DailyIncome * DayInMonth;
    }

    @Override
    public void speak() {
        System.out.println("Hello, this is employee speaking");
    }
}
