import java.util.Scanner;

public class Code05_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        boolean isOdd = input % 2 != 0;
        if (isOdd) {
            System.out.println(input + " is an odd number.");
        } else {
            System.out.println(input + " is an even number.");
        }
        System.out.println(input + " is an " + (isOdd ? "odd" : "even") + " number.");
        s.close();
    }
}