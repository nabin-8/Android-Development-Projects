class demo_constructor_overloading {

    demo_constructor_overloading(int a) {
        System.out.println("Sum having one parameter = " + (a + 50));

    }

    demo_constructor_overloading(int a, int b) {
        System.out.println("Sum having two parameters: " + (a + b));

    }

    demo_constructor_overloading(int x, float y) {
        System.out.println("Sum having two different tyes: " + (x + y));
    }

    public class ConstructorOverloading {
        public static void main(String[] args) {
            demo_constructor_overloading obj1;
            obj1 = new demo_constructor_overloading(69);
            demo_constructor_overloading obj2 = new demo_constructor_overloading(22, 45);
            demo_constructor_overloading obj3 = new demo_constructor_overloading(17, 36.4f);
        }
    }
}
