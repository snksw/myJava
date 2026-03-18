import java.util.Scanner;

public class Code02_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        try {
            num = s.nextInt();
            System.out.println("User Input: " + num);
        } catch (Exception error) {
            System.out.println("Failed to parse input");
        }
        s.close();
    }
}