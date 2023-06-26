public class Demonstrate_BitwiseOperato {
    public static void main(String[] args) {
        // QNo 4
        // a.Demonstrate different operators.

        /*
         * Types of Operators
         * 1) Arithematic operator
         * 2)Assignment operator
         * 3)Comparision operator
         * 4)Logical operator
         * 5)Bitwise Operator
         * 6)Auto Increment/Decrement operator
         */
        // Bitwise Operator
        int a = 10, b = 3, c;
        c = a & b;
        System.out.println("a&b=" + c);
        c = a | b;
        System.out.println("a|b=" + c);
        c = a ^ b;
        System.out.println("a^b=" + c);
        c = a << b;
        System.out.println("a<<b=" + c);
        c = a >> b;
        System.out.println("a>>b=" + c);
        c = a >>> b;
        System.out.println("a>>>b=" + c);

    }
}
