public class ArraySum {
    public static void main(String[] args) {
        int[] values = {3, 5, 7, 9};
        int total = 0;
        for (int val : values) total += val;
        System.out.println("Sum: " + total);
    }
}
