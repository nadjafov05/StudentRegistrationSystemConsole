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
            System.out.println((i+1) + ":"+st.getFullInfo());
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
    public static void updateStudentNewObject(){
        StudentUtil.printAllRegisteredStudnets();
        int i = InputUtil.requireNumber("Enters number index in Users");
        Student s = StudentUtil.fillStudent();
        Config.students[i-1] = s;
        StudentUtil.printAllRegisteredStudnets();
    }

    public static void updateStudentSameObject(){
        StudentUtil.printAllRegisteredStudnets();

        int i = InputUtil.requireNumber("Which student would you like to make changes to?");

        System.out.println("Enter the new information");
        Student selectedStudent  = Config.students[i-1];
        String changeParams = InputUtil.requireText("What do you want to change in the students? 'name','surname', 'classname' or 'age'");

        if (changeParams.contains("'name'")){
            selectedStudent.setName(InputUtil.requireText("name"));
        }
        if (changeParams.contains("'surname'")){
            selectedStudent.setSurname(InputUtil.requireText("surname"));
        }
        if (changeParams.contains("'classname'")){
            selectedStudent.setClassName(InputUtil.requireText("classname"));
        }
        if (changeParams.contains("'age'")){
            selectedStudent.setStudentAge(InputUtil.requireNumber("age"));
        }
    }

    public static void updateStudentWithSplit(){
        StudentUtil.printAllRegisteredStudnets();

        int index = InputUtil.requireNumber("Which student would you like to make changes to?");

        System.out.println("Enter the new information");
        Student selectedStudent  = Config.students[index-1];
        String changeParams = InputUtil.requireText("What do you want to change in the students? 'name','surname', 'classname' or 'age'");

        String[] parametrs = changeParams.split(",");
        for (int i=0;i<parametrs.length;i++) {
            String param = parametrs[i];
            if (param.equalsIgnoreCase("name")) {
                selectedStudent.setName(InputUtil.requireText("name"));
            }else if (param.equalsIgnoreCase("surname")) {
                selectedStudent.setSurname(InputUtil.requireText("surname"));
            }else if (param.equalsIgnoreCase("classname")) {
                selectedStudent.setClassName(InputUtil.requireText("classname"));
            }else if (param.equalsIgnoreCase("age")) {
                selectedStudent.setStudentAge(InputUtil.requireNumber("age"));
            }
        }
    }

}
