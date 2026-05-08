public class Code08_02 {
    public static void main(String[] args) {
    }
}

class Rabbit08_02 {
    String shape;
    int xPos, yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    public String toString() {
        return "(" + this.xPos + ", " + this.yPos + ")에 있는 " + this.shape;
    }
}

class HouseRabbit08_02 extends Rabbit08_02 {
    String owner;

    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }
}

class MountainRabbit08_02 extends Rabbit08_02 {
    String mountain;

    void eatGrass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}