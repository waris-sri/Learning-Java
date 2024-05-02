/* LINKED LISTS */
// has 3 types:
//   (1) Singly linked list: only has next references, no previous references, the pointer will stop at the TAIL
//   (2) Doubly linked list: has both next and previous references, the pointer will stop at the TAIL
//   (3) Circular linked list: only has next references, but the pointer will rerun from HEAD to TAIL.
// store data in nodes (not arrays), each node contains a value (element) and a reference to the next/previous node
//   - the whole linked list as the HEAD (starting point) and TAIL (ending point)
// to retrieve an element, the pointer will start from the HEAD and go through the nodes until it finds the element we want
//   - unlike the instant find of ArrayList, retrieving data from LinkedList is slower
// to update the data, e.g. add(), a new node will be added to the specified position and the references will be updated to properly connect the new node with the list; no recreating a new array unlike the ArrayList, making this very efficient.

import java.util.LinkedList;
public class LinkedLists {
    public static void main(String[] args) {
        // Get the starting time
        long startTime = System.nanoTime();

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10); // 0
        list.add(20); // 1
        list.add(30); // 2
        list.add(40); // 3
        list.add(50); // 4
        System.out.println(list);

        // add new items in
        list.add(1, 15);
        list.add(2, 25);
        list.add(3, 35);
        list.add(4, 45);
        list.add(55);
        System.out.println(list);

        // Get the ending time
        long endTime = System.nanoTime();

        // Calculate the difference and print the execution time
        long executionTime = endTime - startTime;
        System.out.println("Start time: " + startTime);
        System.out.println("End time: " + endTime);
        System.out.println("Execution time: " + executionTime + " nanoseconds (LinkedList)");
    }
}