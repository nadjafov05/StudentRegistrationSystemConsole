package main;

import Util.InputUtil;
import Util.StudentUtil;
import bean.Student;

public class Main {
    public static void main(String[] args) {
        int menu = InputUtil.requireNumber("What do you want to do?" +
                "\n 1. Register Student" +
                "\n 2. Show all Stundets" +
                "\n 3. Find Student" +
                "\n 4. Update Student");

        if (menu == 1) {
            StudentUtil.registerStudents();
        }else if (menu == 2){
            StudentUtil.printAllRegisteredStudnets();
        }else if (menu == 3){
            String text = InputUtil.requireText("Type Text: name ,surname or classname");
            for (int i=0;i<Config.students.length;i++){
                Student st = Config.students[i];
                if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)){

                }
            }
        }
    }
}