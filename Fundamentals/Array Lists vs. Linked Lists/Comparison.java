/* ArrayList vs. LinkedLists */

import java.util.ArrayList;
import java.util.LinkedList;

public class Comparison {
    public static void main(String[] args) {
        System.out.println("Adding In-between Elements:");
        // get ArrayList starting time
        long startTimeA = System.nanoTime();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // add new items in
        list.add(1, 15);
        list.add(2, 25);
        list.add(3, 35);
        list.add(4, 45);
        list.add(5, 55);
        System.out.println(list);
        // get ArrayList ending time
        long endTimeA = System.nanoTime();
        // print ArrayList execution time
        long executionTimeA = endTimeA - startTimeA;
        // System.out.println("Start time: " + startTimeA);
        // System.out.println("End time: " + endTimeA);
        System.out.println("Execution time: " + executionTimeA + " nanoseconds (ArrayList)");

        // get LinkedList starting time
        long startTimeL = System.nanoTime();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        // add new items in
        list2.add(1, 15);
        list2.add(2, 25);
        list2.add(3, 35);
        list2.add(4, 45);
        list2.add(55);
        System.out.println(list2);
        // get LinkedList ending time
        long endTimeL = System.nanoTime();
        // print LinkedList execution time
        long executionTimeL = endTimeL - startTimeL;
        // System.out.println("Start time: " + startTimeL);
        // System.out.println("End time: " + endTimeL);
        System.out.println("Execution time: " + executionTimeL + " nanoseconds (LinkedList)");

        System.out.println("\nAppending Elements:");
        // get ArrayList starting time
        long startTimeA2 = System.nanoTime();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(50);
        // add new items in
        list3.add(1, 15);
        list3.add(2, 25);
        list3.add(3, 35);
        list3.add(4, 45);
        list3.add(5, 55);
        System.out.println(list3);
        // get ArrayList ending time
        long endTimeA2 = System.nanoTime();
        // print ArrayList execution time
        long executionTimeA2 = endTimeA2 - startTimeA2;
        // System.out.println("Start time: " + startTimeA2);
        // System.out.println("End time: " + endTimeA2);
        System.out.println("Execution time: " + executionTimeA2 + " nanoseconds (ArrayList)");

        // get LinkedList starting time
        long startTimeL2 = System.nanoTime();
        LinkedList<Integer> list4 = new LinkedList<Integer>();
        list4.add(10);
        list4.add(20);
        list4.add(30);
        list4.add(40);
        list4.add(50);
        // add new items in
        list4.add(15);
        list4.add(25);
        list4.add(35);
        list4.add(45);
        list4.add(55);
        System.out.println(list4);
        // get LinkedList ending time
        long endTimeL2 = System.nanoTime();
        // print LinkedList execution time
        long executionTimeL2 = endTimeL2 - startTimeL2;
        // System.out.println("Start time: " + startTimeL2);
        // System.out.println("End time: " + endTimeL2);
        System.out.println("Execution time: " + executionTimeL2 + " nanoseconds (LinkedList)");
    }
}

/*
 * Q: (Adding In-between Elements) Why was LinkedList slower than ArrayList?
 * A:
 * In the provided code, the LinkedList was slower than the ArrayList because of
 * the way these
 * data structures are implemented and how they handle operations like adding
 * elements.
 * 
 * ArrayList is a dynamic array, which means it internally uses an array to
 * store the elements.
 * When an element is added to an ArrayList, if there is not enough space in the
 * array, it creates
 * a new array with a larger capacity, copies the elements from the old array to
 * the new array,
 * and then adds the new element. This operation can be quite fast, especially
 * if there is enough
 * space in the array to accommodate the new element, since it only requires
 * shifting a few elements.
 * 
 * On the other hand, LinkedList is a doubly linked list, which means it
 * consists of nodes, where
 * each node stores an element and a reference to the previous and next nodes.
 * When an element is
 * added to a LinkedList, it creates a new node, updates the previous node's
 * next reference, and
 * the next node's previous reference. This operation, in general, is slower
 * than adding an
 * element to an ArrayList, especially when adding an element in the middle of
 * the list, as it
 * requires updating multiple references.
 * 
 * In the provided code, adding elements in the middle of the list (using
 * add(index, element))
 * causes the LinkedList to be slower than the ArrayList. If you were to add
 * elements at the end
 * of the list, you might notice that the difference in execution time would be
 * smaller or even in
 * favor of the LinkedList. However, for operations like random access,
 * ArrayList would still be
 * faster due to its underlying array implementation.
 */