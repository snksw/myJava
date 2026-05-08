public class Code08_04 {
    public static void main(String[] args) {
        new HouseRabbit08_04();
    }
}

class Rabbit08_04 {
    Rabbit08_04() {
        System.out.println("1. 슈퍼 클래스(토끼)의 생성자가 호출됩니다.");
    }
}

class HouseRabbit08_04 extends Rabbit08_04 {
    HouseRabbit08_04() {
        System.out.println("2. 서브 클래스(집토끼)의 생성자가 호출됩니다.");
    }
}
