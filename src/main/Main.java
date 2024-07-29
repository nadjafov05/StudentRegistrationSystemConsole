package main;

import bean.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to do?" +
                "\n 1. Register Student" +
                "\n 2. Show all Stundets" +
                "\n 3. Find Student" +
                "\n 4. Update Student");
        int menuOperations = sc.nextInt();

        if (menuOperations == 1) {
            sc = new Scanner(System.in);
            System.out.println("How many students will you register?");
            int count = sc.nextInt();
            Config.students = new Student[count];

            for (int i = 0; i < count; i++) {
                System.out.println((i+1) + ": Register");
                sc = new Scanner(System.in);
                System.out.println("Enter Name");
                String name = sc.nextLine();

                sc = new Scanner(System.in);
                System.out.println("Enter Surname");
                String surname = sc.nextLine();

                sc = new Scanner(System.in);
                System.out.println("Enter Class Name");
                String className = sc.nextLine();

                sc = new Scanner(System.in);
                System.out.println("Enter Age");
                int studentAge = sc.nextInt();

                Student st = new Student(name, surname, className, studentAge);

                Config.students[i] = st;

            }

            for (int i=0;i<Config.students.length;i++){
                Student st = Config.students[i];
                System.out.println("Name: "+ st.getName() + " : " + "Surname: "+st.getSurname() +" : " +"ClassName: "+ st.getClassName() +" : "+"Age: " + st.getStudentAge());
            }

        }
    }
}