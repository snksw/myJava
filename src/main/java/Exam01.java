import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        System.out.println((a+b).replaceAll(" ", "").toLowerCase());
        s.close();
    }
}