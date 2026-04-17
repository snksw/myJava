class Rabbit {
    private String shape = "default";
    private int xPos, yPos;

    Rabbit() {
        this.shape = "잘 모르는 토끼";
    }

    Rabbit(String val) {
        this.shape = val;
    }

    public String getShape() {
        return this.shape;
    }

    public void setShape(String val) {
        this.shape = val;
    }

    public int getXPos() {
        return this.xPos;
    }

    public int getYPos() {
        return this.yPos;
    }

    public void setPosition(int x, int y) {
        this.xPos = x; this.yPos = y;
    }

    public String toString() {
        return "[Rabbit Shape:\"" + this.shape + "\", Pos: [" + this.xPos + ", " + this.yPos + "]]";
    }
}

public class Code07_06 {
    public static void main(String[] args) {
        Rabbit rabbit0 = new Rabbit();
        System.out.println(rabbit0);
        System.out.println(rabbit0.getClass());

        Rabbit rabbit1 = new Rabbit("원");
        System.out.println(rabbit1);
        System.out.println(rabbit1.getShape());

        Rabbit rabbit2 = new Rabbit("삼각형");
        // rabbit2.shape = "작은 토끼";
        rabbit2.setShape("작은 토끼");
        // rabbit2.xPos = 40;
        // rabbit2.yPos = 80;
        rabbit2.setPosition(40, 80);
        System.out.println(rabbit2);
        System.out.println(rabbit2.getXPos());
        System.out.println(rabbit2.getYPos());

        Rabbit rabbit3 = new Rabbit("토끼");
        rabbit3.setPosition(10, 20);
        System.out.println(rabbit3);
    }
}
