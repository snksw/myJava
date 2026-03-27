import java.util.Scanner;

public class Code03_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("필기시험 점수를 입력하세요: ");
        int score = s.nextInt();
        System.out.println(score >= 70);
        s.close();
    }
}
