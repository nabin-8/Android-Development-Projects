public class Demonstrate_AssignmentOperator {
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

        // Assignment operator
        int a = 5, b = 10, c;
        c = a + b;
        System.out.println("c=a+b" + c);
        c += a;
        System.out.println("c+=a=" + c);
        c -= a;
        System.out.println("c-=a=" + c);
        c *= a;
        System.out.println("c*=a=" + c);
        c /= a;
        System.out.println("c/=a=" + c);
        c %= a;
        System.out.println("c%=a=" + c);
        c &= a;
        System.out.println("c&=a=" + c);
        c ^= a;
        System.out.println("c^=a=" + c);
        c |= a;
        System.out.println("c|=a=" + c);
        c <<= 2;
        System.out.println("c<<=2=" + c);
        c >>= 2;
        System.out.println("c>>=2=" + c);
    }
}
