public class Code06_08 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1001; i <= 2000; i += 2) total += i;
        System.out.println("1001-2000 odd 합계: " + total);
    }
}
