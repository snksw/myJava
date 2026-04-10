import java.util.Scanner;

public class Code05_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("점수 입력: ");
        int input = s.nextInt();
        if (input >= 90) {
            System.out.print("A");
        } else if (input >= 80) {
            System.out.print("B");
        } else if (input >= 70) {
            System.out.print("C");
        } else if (input >= 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
        System.out.println("학점입니다.");
        s.close();
    }
}