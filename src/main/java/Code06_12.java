import java.util.Scanner;

public class Code06_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0, num1, num2;
        for (;;) {
            System.out.print("num1 => ");
            num1 = s.nextInt();
            if (num1 == 0) break;
            System.out.print("num2 => ");
            num2 = s.nextInt();
            System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        }
        System.out.println("tinue");
        s.close();
    }
}
