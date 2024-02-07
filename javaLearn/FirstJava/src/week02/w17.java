package week02;

import java.util.Scanner;

public class w17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt();

        // 구구단
        for (int i =2; i <= 9; i++) {
            if (i == passNum) {
                continue;
            }
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + (i*j) + "입니다.");
            }
        }
    }
}
