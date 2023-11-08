package additionally;

import java.util.Scanner;
//This program calculates the area of a rectangle, triangle, circle.
public class H2 {
    public static void main(String[] args) {
        System.out.println("The area of what do you want to calculate? Rectangle, Triangle, Circle. Write the answer.");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer){
            case "Rectangle" :
                System.out.println("write the length of the rectangle");
                int length = scanner.nextInt();
                System.out.println("write the width of the rectangle");
                int width = scanner.nextInt();
                System.out.println("The area of the rectangle is: " + length * width);
                break;
            case "Triangle" :
                System.out.println("write the length of the base of the triangle");
                int l = scanner.nextInt();
                System.out.println("write the height of the triangle");
                int h = scanner.nextInt();
                System.out.println("The area of the triangle is: " + 0.5 * l * h);
                break;
            case "Circle" :
                System.out.println("write the radius of the circle");
                int r = scanner.nextInt();
                System.out.println("The area of the сircle is: " + 3.14 * (r * r));
                break;
        }
    }
}
