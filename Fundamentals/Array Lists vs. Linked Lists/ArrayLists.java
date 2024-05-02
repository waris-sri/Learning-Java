/* ARRAY LISTS */
// uses a resizable array (mutable) to store data
// stores reference data types ONLY
// pointer can retrieve data instantly (O(1)), but could be time-consuming when updating data
//   - since ArrayList will create an entire new array to specifically handle that change
//   - so, if you're storing objects or large amounts of data, it may not be efficient
//   - ex. for array list [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] (size = 9)
//         - to get 8, it'll immediately go to the 7th index
//         - to append 11, it'll create a whole new array with size = 10, then add 11 at the 10th index
//              - because there was not enough space, if there was enough space, then it'll shift the elements which is faster

import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        /* 1D */
        ArrayList<String> meals = new ArrayList<String>();
        meals.add("hamburger");
        meals.add("pizza");
        meals.add("french fries");
        meals.remove(0);
        meals.set(1, "sushi");
        meals.add(2, "macaron");
      //meals.clear();
        for (int i = 0; i < meals.size(); i++) {
            System.out.println(meals.get(i));
        }

        /* 2D (list of lists) */
        System.out.println();
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        
        ArrayList<String> bakeries = new ArrayList<String>();
        bakeries.add("croissants");
        bakeries.add("baguettes");
        
        ArrayList<String> greens = new ArrayList<String>();
        greens.add("coriander");
        greens.add("leek");
        
        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("soda");
        drinks.add("juice");
        drinks.add("water");
        
        groceryList.add(bakeries);
        groceryList.add(greens);
        groceryList.add(drinks);
        
        System.out.println(groceryList);
        System.out.print("Item at index 2: ");
        System.out.println(groceryList.get(2));
        System.out.print("Element of index 2, in item at index 2: ");
        System.out.println(groceryList.get(2).get(2));
    }
}