package org.example;


class Computer {

        public void PlayingMusic() {
            System.out.println("Ii is now playing");

        }

        public String GetMePen(int cost){

            if (cost >= 10)
                return "Pen";
            else
                return "nothing";


        }
    }

    public class Method{

        static void main(String[] args) {

            Computer obj = new Computer();
            obj.PlayingMusic();
            String str  = obj.GetMePen(2);
            System.out.println(str);

        }

    }

