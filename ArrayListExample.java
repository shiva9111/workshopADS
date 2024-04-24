import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Object> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(78);
        l1.add(78.90);
        l1.add('d');
        l1.add("Apple");
        l1.add("Banana");
        l1.add("Orange");
        System.out.println("Enter at index 1:"  + l1.get(0));
        System.out.println("Elements in the ArrayList: " + l1);
        for(Object f : l1) {
            System.out.println(f+" ");
        }
        l1.add(0,15);
        System.out.println(l1);
        l1.add(0,16);
        System.out.println(l1);
        System.out.println("Enter at index 2:"  + l1.get(2));
        l1.set(2,20);
        System.out.println(l1);
        l1.add(2,22);
        l1.add(4,26);
        System.out.println(l1.remove(1));
        l1.add(1,30);
        l1.add(1,32);
        System.out.println(l1.get(4));
        l1.set(2,55);
        System.out.println(l1);
        System.out.println("Enter at index 3:"  + l1.get(2));
        System.out.println(l1);
        System.out.println("Enter at index 4:"  + l1.remove(3));

    }
}
