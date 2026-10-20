package org.example.oct20;

enum Laptop {
    Dell(2000), MackBook(3000), Hp, Lenovo(2000);
    private Laptop(){
        price = 500;
    }
    private int price;

    private Laptop(int price) {
        this.price = price;
        System.out.print("In Laptop : " + this.name());
    }

    public void setPrice() {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumWithClass {
    static void main(String[] args) {
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + ":" + lap.getPrice());

        }

    }
}
