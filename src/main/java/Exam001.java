import java.util.Scanner;

public class Exam001 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a + " / " + b + " = " + (double) a / b);
        s.close();
    }
}