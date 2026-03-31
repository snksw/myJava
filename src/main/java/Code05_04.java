public class Code05_04 {
    public static void main(String[] args) {
        int num = 200;
        if (num < 100) {
            System.out.println("<  100");
            System.out.println("여기는 참입니다.");
        } else {
            System.out.println(">= 100");
            System.out.println("여기는 거짓입니다.");
        }
        System.out.println("여기는 " + ((num < 100) ? "참" : "거짓") + "입니다.");
    }
}
