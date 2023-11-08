package additionally;
import java.util.Scanner;
//This program calculates the sum of numbers
public class H3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int p = scanner.nextInt();
        int summ = 0;
        int i;
        for (i = 0; i<=p ; i++) {
            summ += i;
        }
        System.out.println(summ);
    }
}
