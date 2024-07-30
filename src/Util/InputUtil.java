package Util;

import java.util.Scanner;

public class InputUtil {
    public static String requireText(String title){
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        String answer = sc.nextLine();
        return answer;
    }

    public static int requireNumber(String numbers){
        Scanner sc = new Scanner(System.in);
        System.out.println(numbers);
        int answer = sc.nextInt();
        return answer;
    }
}
