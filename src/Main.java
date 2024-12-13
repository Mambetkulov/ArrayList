import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        boolean isTrue = true;
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("Aibek",19 ,"Java 16");
        students.add(s1);
        Student s2 = new Student("Baibolot",21 ,"Js");
        students.add(s2);
        Student s3 = new Student("Dastan",24 ,"Js");
        students.add(s3);
        Student s4 = new Student("Baiel",20 ,"Java 16");
        students.add(s4);
        Student s5 = new Student("Islam",26 ,"Js");
        students.add(s5);
        Student s6 = new Student("Kanchoro", 29,"Java 16");
        students.add(s6);
        Student s7 = new Student("Doron",20 ,"Js");
        students.add(s7);
        Student s8 = new Student("Ernis",16 ,"Java 16");
        students.add(s8);
        Student s9 = new Student("Bektur",18 ,"Js");
        students.add(s9);
        Student s10 = new Student("Amir",18 ,"Java 16");
        students.add(s10);


        while(isTrue){
            System.out.println("""
                    \n
                    press 1 to get information about all students
                    press 2 to get all students from java 16
                    press 3 to get all students from js
                    press 4 to get all students  in the age range of 19 - 23
                    press 5 to get all students whose names begin with (A)
                    press 6 to logout
                    """);

            try {
                int choice = new Scanner(System.in).nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println(students);
                        break;

                    }
                    case 2: {
                        student.java(students);
                        break;
                    }
                    case 3: {
                        student.js();
                        break;

                    }
                    case 4: {
                        for (Student i : student.age(students)) {
                            System.out.println(i);
                        }
                        break;
                    }
                    case 5: {
                        for (Student i : student.name(students)) {
                            System.out.println(i);
                        }
                        break;
                    }
                    case 6: {
                        isTrue = false;
                        break;
                    }
                    default: {
                        System.out.println("There is no such command \n");

                    }
                }
            } catch (Exception e) {
                System.out.println("only numbers");
            }
        }



    }
}