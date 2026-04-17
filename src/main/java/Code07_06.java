public class Code07_06 {
    static class Rabbit {
        String shape = "default";
        int xPos, yPos;

        Rabbit(String val) {
            shape = val;
        }

        void setPosition(int x, int y) {
            xPos = x; yPos = y;
        }

        public String toString() {
            return "[Rabbit Shape:\"" + shape + "\", Pos: [" + xPos + ", " + yPos + "]]";
        }
    }
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit("원");
        System.out.println(rabbit1);

        Rabbit rabbit2 = new Rabbit("삼각형");
        rabbit2.shape = "작은 토끼";
        System.out.println(rabbit2);

        Rabbit rabbit3 = new Rabbit("토끼");
        rabbit3.setPosition(10, 20);
        System.out.println(rabbit3);
    }
}
