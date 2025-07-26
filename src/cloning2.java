class Person1 implements Cloneable {
    int id;
    String name;

    Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding clone() method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class cloning2 {
    public static void main(String[] args) {
        try {
            Person1 p1 = new Person1(1011, "Alo1k");

            // Cloning p1 to p2
            Person p2 = (Person) p1.clone();

            // Displaying both objects
            System.out.println("Original Object: " + p1.id + " " + p1.name);
            System.out.println("Cloned Object: " + p2.id + " " + p2.name);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
        }
    }
}
