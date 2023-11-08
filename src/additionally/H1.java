package additionally;
import java.util.Scanner;
//fibonacci numbers
public class H1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of Fibonacci numbers");
        int v = scanner.nextInt();
        System.out.println("enter the first number");
        int a = scanner.nextInt();
        System.out.println("enter second number");
        int b = scanner.nextInt();
        int c;
        for (int t = 0; t < v; t++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(a + b);
            if (v > 100){
                v = 100;
            }
        }
    }
}
