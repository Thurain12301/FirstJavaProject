package org.example;

class Student{

    int rollno;
    int marks;
    String name;
}

public class MultipleArray {

    static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.marks  =  70;
        s1.name   = "Aung Aung";

        Student s2 = new Student();
        s2.rollno = 2;
        s2.marks  = 80;
        s2.name   = "Su Su";

        Student s3 = new Student();
        s3.rollno = 3;
        s3.marks  = 88;
        s3.name   = "Ba Maung";

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(Student stud : student){

            System.out.println(stud.rollno+ " :"+ stud.name + " : " + stud.marks);
        }

    }
}
