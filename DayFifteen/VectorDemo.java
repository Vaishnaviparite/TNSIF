package DayFifteen;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> animals = new Vector<String>();

        animals.add("Dog");
        animals.add("Camel");
        animals.add("Cat");
        animals.add(null);
        animals.add(null);

        System.out.println("Initial Vector : " + animals);

        System.out.println("Element at index at 2 : " + animals.get(2));

        Iterator<String> iterate = animals.iterator();
        System.out.println("Vector : ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(" , ");
        }

        String element = animals.remove(2);
        System.out.println("Removed Element is :" + element);

        System.out.println("New Vector : " + animals);

        animals.clear();
        System.out.println("Vector after clear() : " + animals);
    }
}
