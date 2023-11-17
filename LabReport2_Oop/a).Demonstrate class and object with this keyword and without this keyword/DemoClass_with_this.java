public class DemoClass_with_this {

    // Non-static variables
    int roll;
    String name;

    // Non-static method
    void input(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void output() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        DemoClass_with_this std1 = new DemoClass_with_this();
        std1.input(1, "Ram");
        DemoClass_with_this std2 = new DemoClass_with_this();
        std2.input(2, "Sita");
        std1.output();
        std2.output();
    }

}
