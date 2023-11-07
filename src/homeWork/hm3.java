package homeWork;

import java.util.Scanner;

//Exercise 3

public class hm3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int number = input.nextInt();
        //checking for an even number
        if(number %2 == 0){
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}
