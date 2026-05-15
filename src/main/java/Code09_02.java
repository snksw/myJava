import java.util.Scanner;

public class Code09_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0, k = 4;
        int[] numArr = new int[k];

        for (int i = 0; i < k; i++) {
            System.out.print("숫자: ");
            numArr[i] = s.nextInt();
        }
        s.close();

        for (int i = 0; i < k; i++) total += numArr[i];
        System.out.println("합계 ==> " + total);
    }
}
