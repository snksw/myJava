import java.util.Scanner;

public class Code02_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 0;
        while (true) {
            try {
                num += s.nextInt();
                System.out.println("New Value: " + num);
            } catch (Exception error) {
                System.out.println("Failed to parse input");
                System.out.println("Current Value: " + num);
                break;
            }
        }
        s.close();
    }
}