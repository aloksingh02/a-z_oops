class Person implements Cloneable {
    String name;
    int age;
    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Overriding clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
    // Display method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class ObjectCloning {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("Alok", 25);
            Person p2 = (Person) p1.clone(); // Cloning p1 to p2
            System.out.println("Original Object:");
            p1.display();
            System.out.println("Cloned Object:");
            p2.display();

            // Modify clone
            p2.name = "Rahul";
            p2.age = 30;
            System.out.println("\nAfter modifying cloned object:");
            System.out.println("Original Object:");
            p1.display();
            System.out.println("Cloned Object:");
            p2.display();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}
