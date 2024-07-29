package main;

import Util.InputUtil;
import Util.StudentUtil;
import bean.Student;

public class Main {
    public static void main(String[] args) {
        int menu = 0;
        while (true){
            menu = InputUtil.requireNumber("What do you want to do?" +
                    "\n 1. Register Student" +
                    "\n 2. Show all Stundets" +
                    "\n 3. Find Student" +
                    "\n 4. Update Student");

            if (menu == 1) {
                StudentUtil.registerStudents();
            }else if (menu == 2){
                StudentUtil.printAllRegisteredStudnets();
            }else if (menu == 3){
                StudentUtil.findStudentsAndPrint();
            }
        }
    }
}