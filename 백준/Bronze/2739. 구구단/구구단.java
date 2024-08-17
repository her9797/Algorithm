
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int result;

        a = sc.nextInt();

        for (int i = 1; i <= 9; i++ ) {

            result = a*i;
            System.out.println(a+ " * " + i + " = " + result);
        }
    }
}