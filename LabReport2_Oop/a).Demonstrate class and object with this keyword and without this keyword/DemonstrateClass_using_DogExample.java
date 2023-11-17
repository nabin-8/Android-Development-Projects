public class DemonstrateClass_using_DogExample {

    // Data members or class members
    String breed = "German Shepherd";
    int age = 1;
    String color = "brown";

    // Member functions or methods
    public void barking() {
        System.out.println("Dog is barking....");
    }

    public void eating() {
        System.out.println("Dog is eating.....");
    }

    public static void main(String[] args) {
        DemonstrateClass_using_DogExample obj = new DemonstrateClass_using_DogExample();
        System.out.println("Breed: " + obj.breed);
        System.out.println("Age: " + obj.age);
        System.out.println("Color: " + obj.color);
        obj.barking();
        obj.eating();

    }
}
