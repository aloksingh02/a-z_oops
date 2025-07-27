import java.util.Vector;
import java.util.Enumeration;

public class enumerator_2{
    public static void main(String[] args) {
        // Create a Vector and add elements
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Get Enumeration object
        Enumeration<String> e = fruits.elements();

        // Traverse elements using Enumeration
        System.out.println("Fruits list:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

