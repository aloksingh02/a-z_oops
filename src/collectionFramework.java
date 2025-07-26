import java.util.*;

public class collectionFramework {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");

        System.out.println("ArrayList (List): " + fruits);

        Set<String> uniqueFruits = new HashSet<>(fruits);
        System.out.println("HashSet (Set): " + uniqueFruits);  // removes duplicates

        Map<Integer, String> fruitMap = new HashMap<>();
        fruitMap.put(1, "Apple");
        fruitMap.put(2, "Banana");
        fruitMap.put(3, "Mango");

        System.out.println("HashMap (Map): " + fruitMap);

        for (Map.Entry<Integer, String> entry : fruitMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
