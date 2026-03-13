public class Hello {
    // public static void main(String[] args)은 프로그램에서 가장 먼저 실행되는 함수
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) System.out.println(args[i]);
        System.out.println("Hello world!");
        System.out.println("Random Message");
    }
}