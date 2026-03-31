import java.util.Scanner;

public class Code05_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int input = s.nextInt();
        if (input > 100) {
            if (input < 1000) {
                System.out.println("1000 > " + input + " > 100");
            } else {
                System.out.println(input + " >= 1000");
            }
        } else {
            System.out.println("100 >= " + input);
        }
        s.close();
    }
}