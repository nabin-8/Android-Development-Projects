
public class ArrayRelatedException {
    public static void main(String[] args) {

        try {
            int[] array = new int[5];
            array[10] = 25;
            System.out.println("Value at index 10: " + array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End of program...");

        // int[] array = new int[5];
        // array[10] = 25;
        // System.out.println("Value at index 10: " + array[10]);
    }
}
