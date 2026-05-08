public class Code08_06 {
    public static void main(String[] args) {
        HouseRabbit08_06 hRabbit = new HouseRabbit08_06();
        MountainRabbit08_06 mRabbit = new MountainRabbit08_06();

        hRabbit.move(500, 500);
        mRabbit.move(500, 500);

        System.out.printf("집토끼 위치: (%d %d)\n", hRabbit.xPos, hRabbit.yPos);
        System.out.printf("산토끼 위치: (%d %d)\n", mRabbit.xPos, mRabbit.yPos);
    }
}

class Rabbit08_06 {
    int xPos, yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}

class HouseRabbit08_06 extends Rabbit08_06 {
    @Override
    void move(int x, int y) {
        super.move(x, y);
        if (this.xPos > 100) this.xPos = 100;
        if (this.yPos > 100) this.yPos = 100;
    }
}

class MountainRabbit08_06 extends Rabbit08_06 {}