public class Code06_07 {
    public static final double PI = 3.141592653589793238462643383279502884197169399375105820974644;
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i <= 1000; i++) total += i;
        System.out.println("1-1000 합계: " + total);
    }
}
