public class Exam01 {
    public static void main(String[] args) {
        String str = "****";
        int len = str.length();
        for (int i = 1; i != 0; i++) {
            System.out.println(str.substring(0, Math.abs(i)));
            if (i == len) i -= len * 2;
        }
    }
}

// int len = 4;
// String str = "";
// for (int c = 0; c < 4; c++) str += "*";