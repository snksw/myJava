class Rabbit08_01 {
    String shape;
    int xPos;
    int yPos;
    static int count;

    Rabbit08_01() {
        count++;
    }
}

public class Code08_01 {
    public static void main(String[] args) {
        System.out.println("객체 생성 전의 총 토끼 수 ==> " + Rabbit08_01.count);
        Rabbit08_01 rabbit1 = new Rabbit08_01();
        System.out.println("토끼 객체1 생성 후의 총 토끼 수 ==> " + Rabbit08_01.count);
        Rabbit08_01 rabbit2 = new Rabbit08_01();
        System.out.println("토끼 객체2 생성 후의 총 토끼 수 ==> " + Rabbit08_01.count);
    }
}
