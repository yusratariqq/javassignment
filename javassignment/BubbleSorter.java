import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] data = {4, 2, 9, 1};
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0; j < data.length-i-1; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(data));
    }
}
