package org.example.ooptest;

class Employee{

    private final int DAY_IN_MONTH = 30;

    private int id;
    private String name;
    private String dept;
    private double dailyIncome;
    private double monthlyIncome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", dailyIncome=" + dailyIncome +
                ", monthlyIncome=" + monthlyIncome +
                '}';
    }

    // DATA HIDING + CLASS BEHAVIOUR CONTROL => ENCAPSULATION
    public double calculateSalary() {
        return this.dailyIncome * DAY_IN_MONTH;
    }

}