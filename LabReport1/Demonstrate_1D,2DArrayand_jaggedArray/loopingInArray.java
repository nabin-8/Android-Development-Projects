
public class loopingInArray {
    public static void main(String[] args) {
        String[] name = { "Nabin", "Sairaj", "Adyatan", "Hemanta" };
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
            System.out.print("\t");
        }
        System.out.println();

        Integer[] Symbolno = { 10, 20, 30, 40 };
        for (int j : Symbolno) {
            System.out.print(j);
            System.out.print("\t");
        }

    }

}
