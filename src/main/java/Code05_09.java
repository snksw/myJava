import java.util.Scanner;

public class Code05_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("1-3 중 선택하세요: ");
        byte select = s.nextByte();
        switch (select) {
            case 1: case 3: case -1, -3:
                System.out.println(select + "을 선택했습니다.");
                break;
            case 2:
                System.out.println(select + "를 선택했습니다.");
                break;
            default:
                System.out.println("잘못된 값입니다.");
        }
        s.close();
    }
}
