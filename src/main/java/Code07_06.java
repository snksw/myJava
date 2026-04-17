public class Code07_06 {
    static class Rabbit {
        String shape = "default";
        int xPos, yPos;
        void setPosition(int x, int y) {
            xPos = x; yPos = y;
        }
        public String toString() {
            return "[Rabbit Shape:\"" + shape + "\", Pos: [" + xPos + ", " + yPos + "]]";
        }
    }
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        rabbit1.shape = "원";
        System.out.println(rabbit1);

        Rabbit rabbit2 = new Rabbit();
        rabbit2.shape = "삼각형";
        System.out.println(rabbit2);

        Rabbit rabbit3 = new Rabbit();
        rabbit3.shape = "토끼";
        rabbit3.setPosition(10, 20);
        System.out.println(rabbit3);
    }
}
