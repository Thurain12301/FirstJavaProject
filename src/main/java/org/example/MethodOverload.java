package org.example;



    class Caculator{
        public int add(int n1,int n2){

            int result = n1 + n2;
            return result;
        }
        public double add(double n1,int n2){

            double result = n1 + n2;
            return result;
        }


    }
    public class MethodOverload {
    static void main(String[] args) {


        Caculator obj = new Caculator();
        double r1 = obj.add(2.3,5);
        System.out.print(r1);




    }
}
