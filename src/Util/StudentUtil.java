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
    public static void findStudentsAndPrint(){
        String text = InputUtil.requireText("Type Text: name ,surname or classname");
        Student[] result = findStudents(text);
        for (int i=0;i<result.length;i++){
            System.out.println(result[i].getFullInfo());
        }
    }

    public static Student[] findStudents(String text){
        int count =0;
        for (int i=0;i<Config.students.length;i++){
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)){
                count++;
            }
        }

        Student[] result = new Student[count];

        for (int i=0;i<Config.students.length;i++){
            int found =0;
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)){
                result[found] = st;
                found++;
            }
        }
        return result;
    }
}
