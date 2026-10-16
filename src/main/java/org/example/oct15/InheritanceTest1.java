package org.example.oct15;

class Calculator {

    public int add(int n1, int n2) {

        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

}

class AdvCac extends Calculator {

    public int muti(int n1, int n2) {

        return n1 * n2;

    }

    public int dev(int n1, int n2) {

        return n1 / n2;
    }

    public static class SuperAdvCa extends AdvCac {
        public double pow(int n1,int n2){

            return Math.pow(n1,n2);
        }
    }
}


public class InheritanceTest1 {

    static void main(String[] args) {

        AdvCac.SuperAdvCa obj = new AdvCac.SuperAdvCa();
        int r1 = obj.add(1, 2);
        int r2 = obj.sub(4, 2);
        int r3 = obj.muti(3, 4);
        int r4 = obj.dev(6, 3);
        double r5 = obj.pow(4, 2);

        System.out.print(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
