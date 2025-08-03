public class TwoDArray {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3}, {4,5,6}};
        for (int[] row : grid) {
            for (int cell : row) System.out.print(cell + " ");
            System.out.println();
        }
    }
}
