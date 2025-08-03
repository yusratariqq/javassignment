import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sorted = {2, 5, 8, 12, 16};
        int target = 8, idx = Arrays.binarySearch(sorted, target);
        System.out.println(target + " found at index: " + idx);
    }
}
