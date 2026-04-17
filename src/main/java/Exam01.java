public class Exam01 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 7, 1, 4, 7, 3, 1, 9, 0, 7, 3};
        if (nums.length == 0) System.exit(1);
        int k = nums[0];
        for (int i = 1; i < nums.length; i++) if (nums[i] > k) k = nums[i];
        System.out.println(k + "입니다.");
    }
}