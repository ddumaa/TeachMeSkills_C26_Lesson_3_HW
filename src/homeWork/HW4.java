package homeWork;

import java.util.Scanner;

//Exercise 4

public class HW4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the temperature");
        int t = input.nextInt();
        //temperature check
        if (t>-5) {
            System.out.println("Warm");
        } else if (-5 >= t && t > -20) {
            System.out.println("Normal");
        } else if (-20 >= t){
            System.out.println("Cold");
        }
    }
}
