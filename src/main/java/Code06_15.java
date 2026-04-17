public class Code06_15 {
    public static class Tst {
        public boolean x = true;
        public void r(String str) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {

        Tst a = new Tst(), b = new Tst(), c = new Tst(), d = new Tst();

        c.x = false;

        for (int i = 0; i < 100; i++) {
            if (a.x) {
                a.r(i + "/i.a");
                if (b.x) {
                    b.r(i + "/i.b");
                    if (c.x) {
                        c.r(i + "/i.c");
                        if (d.x) {
                            d.r(i + "/i.d");
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            if (!a.x) continue;
            a.r(i + "/c.a");
            if (!b.x) continue;
            b.r(i + "/c.b");
            if (!c.x) continue;
            c.r(i + "/c.c");
            if (!d.x) continue;
            d.r(i + "/c.d");
        }

    }
}
