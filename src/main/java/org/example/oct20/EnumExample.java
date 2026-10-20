package org.example.oct20;

enum Status {
    Running, Failed, Success, Pending;
}

public class EnumExample {
    static void main(String[] args) {
        Status[] ss = Status.values();
        for (Status s : ss) {
            System.out.println(s);
        }

        Status a = Status.Failed;
        if (a == Status.Running){
            System.out.println("Please Wait It is running");
        }
        else if (a == Status.Pending){
            System.out.println("Please Wait");

        }else{
            System.out.println("It is failed");
        }
        switch (a){

            case Running:
                System.out.println("Please Wait It is running");
                break;

            case Pending:
                System.out.println("It is pending");
                break;
            case Failed:
                System.out.println("It is failed");
                break;
        }

    }
}
