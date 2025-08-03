import java.util.Arrays;
public class MatrixOps {
    public static void main(String[] args) {
        int[][] m1 = {{1,2}, {3,4}}, m2 = {{5,6}, {7,8}};
        int[][] sum = new int[2][2], prod = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
                for (int k = 0; k < 2; k++) {
                    prod[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("Sum:\n" + Arrays.deepToString(sum));
        System.out.println("Product:\n" + Arrays.deepToString(prod));
    }
}