public class Code08_08 {
    public static void main(String[] args) {
        new HouseRabbit08_08().sleep();
        new MountainRabbit08_08().sleep();
    }
}

abstract class Rabbit08_08 {
    int xPos, yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    abstract void sleep();
}

class HouseRabbit08_08 extends Rabbit08_08 {
    @Override
    void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit08_08 extends Rabbit08_08 {
    @Override
    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}