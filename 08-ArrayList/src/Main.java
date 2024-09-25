import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1. create a new array list, add some colors (string) and print out the collection
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");
        System.out.println(colors);

        //2. iterate through all elements in an array list
        for (String color : colors) {
            System.out.println(color);
        }


        //3. insert an element into the array list at the first position
        //we could use 2 methods: 1:
        colors.add(0,"Orange");
        System.out.println(colors);
        //2:
        colors.addFirst("Dark blue");
        System.out.println(colors);


        //4. retrieve an element (at a specified index) from a given array list
        System.out.println(colors.get(0));


        //5. update specific array element by given element
        colors.set(4, "Purple");
        System.out.println(colors);


        //6. remove the third element from an array list
        colors.remove(2);
        System.out.println(colors);


        //7. search an element in an array list
        System.out.println(colors.contains("Yellow"));
        System.out.println(colors.contains("Purple"));


        //8. sort a given array list
        //e.g. sorting in alphabetical order
        Collections.sort(colors);
        System.out.println(colors);


        //9. copy one array list into another
        ArrayList<String> copyOfColors = new ArrayList<>(colors.size());
        for (int i = 0; i < colors.size(); i++) {
            copyOfColors.add(null);  // Add nulls to ensure the destination list has enough space
        }
        Collections.copy(copyOfColors, colors);
        System.out.println(colors);
        System.out.println(copyOfColors);


        //10.reverse elements in an array list
        Collections.reverse(colors);
        System.out.println(colors);


        //11.compare two array lists
        System.out.println(colors.equals(copyOfColors));


        //12.empty an array list
        colors.clear();


        //13. test an array list is empty or not
        System.out.println(colors.isEmpty());


        //14. increase the size of an array list
        copyOfColors.ensureCapacity(14);


        //15.trim the capacity of an array list the current list size
        copyOfColors.trimToSize();
    }
}

