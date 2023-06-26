public class multiDimensionalArrays {
    public static void main(String[] args) {
        // declaring and initializing 2D array
        int arr[][] = { { 11, 12, 13, 14 }, { 22, 24, 25, 27 }, { 34, 34, 55, 100 } };
        // printing 2D array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}