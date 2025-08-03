public class ArrayMinMax {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 7};
        int min = nums[0], max = nums[0];

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Smallest: " + min + ", Largest: " + max);
    }
}
