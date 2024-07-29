package Util;

import bean.Student;
import main.Config;

public class StudentUtil {
    public static Student fillStudent(){
        String name = InputUtil.requireText("Enter Name");
        String surname = InputUtil.requireText("Enter Surname");
        String className = InputUtil.requireText("Enter ClassName");
        int studentAge = InputUtil.requireNumber("Enter Age");

        Student st = new Student(name, surname, className, studentAge);

        return st;
    }

    public static void printAllRegisteredStudnets(){
        if (Config.students == null){
            return;
        }
        for (int i = 0; i< Config.students.length; i++){
            Student st = Config.students[i];
            System.out.println(st.getFullInfo());
        }
    }

    public static void registerStudents(){
        int count = InputUtil.requireNumber("How many students will you register?");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ": Register");
            Config.students[i] = StudentUtil.fillStudent();
        }

        System.out.println("Registrations Completed Successfully");
        StudentUtil.printAllRegisteredStudnets();
    }
}
