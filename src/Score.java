import java.sql.SQLOutput;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Input Physics score: ");
        a = scanner.nextInt();

        System.out.println("Input Chemistry score: ");
        b = scanner.nextInt();

        System.out.println("Input Math score: ");
        c = scanner.nextInt();

        int S = a + b + c;
        System.out.println("Sum score: " + S);

        int A = (a + b + c) / 3;
        System.out.println("Average score: " + A);
    }

}
