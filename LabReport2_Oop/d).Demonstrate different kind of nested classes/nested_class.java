class nested_class {

    static void outerDisplay() {
        System.out.println("Hello I am static outerDisplay method...");
    }

    void nonStaticMethod() {
        System.out.println("Hello I am nonStaticMethod in Outer class...");
    }

    static class Inner {
        void innerDisplay() {
            System.out.println("Hello I am static innerDisplay method...");
        }

        static void output() {
            System.out.println("I am static output method inside Inner class");
        }
    }

    public static void main(String[] args) {
        // Accessing static method of Outer class
        nested_class.outerDisplay();

        // Accessing static method of Inner class
        nested_class.Inner.output();

        // Accessing nonStaticMethod of Outer Class
        nested_class outer = new nested_class();
        outer.nonStaticMethod();

        // Accessing non-static method of Inner class
        nested_class.Inner inn = new nested_class.Inner();
        inn.innerDisplay();

    }
}
