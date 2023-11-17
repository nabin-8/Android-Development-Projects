public class demo_MethodOverloading {

    static void sum(int a) {
        System.out.println("Sum having one parameter = " + (a + 50));

    }

    static void sum(int a, int b) {
        System.out.println("Sum having two parameters: " + (a + b));

    }

    static void sum(int x, float y) {
        System.out.println("Sum having two different types of parameters: " + (x + y));
    }

    public static void main(String[] args) {

        demo_MethodOverloading.sum(25);
        demo_MethodOverloading.sum(45, 65);
        demo_MethodOverloading.sum(35, 25.5f);
    }

}
