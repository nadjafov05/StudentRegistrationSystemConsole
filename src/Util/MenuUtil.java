package Util;

public class MenuUtil {
    public static void processMenu(int selectMenu){
        switch (selectMenu) {
            case 1:
                StudentUtil.registerStudents();
                break;
            case 2:
                StudentUtil.printAllRegisteredStudnets();
                break;
            case 3:
                StudentUtil.findStudentsAndPrint();
                break;
            case 4:
                StudentUtil.updateStudentNewObject();
                break;
        }
    }
}
