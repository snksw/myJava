import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        boolean m3 = input % 3 == 0;
        boolean m5 = input % 5 == 0;
        if (m3) {
            if (m5) {
                System.out.println("3의 배수이자 5의 배수입니다.");
            } else {
                System.out.println("3의 배수입니다.");
            }
        } else {
            if (m5) {
                System.out.println("5의 배수입니다.");
            } else {
                System.out.println("3의 배수도 5의 배수도 아닙니다.");
            }
        }
    }
}
