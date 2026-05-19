import java.util.List;
import java.util.Vector;

public class Code09_12 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int value = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                arr[i][k] = value++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                System.out.printf("%3d ", arr[i][k]);
            }
            System.out.println();
        }
    }
}
