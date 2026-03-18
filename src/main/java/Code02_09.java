public class Code02_09 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;

        /*
        int resAdd, resSub, resMul;
        double resDiv;

        resAdd = num1 + num2;
        resSub = num1 - num2;
        resMul = num1 * num2;
        resDiv = (double) num1 / num2;
        */

        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / (double) num2));

        System.out.println(2147483647+1);
        System.out.println(1 == 1.0f);
    }
}