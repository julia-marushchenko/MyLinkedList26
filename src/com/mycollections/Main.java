/**
 *  Java program to create, read, update, and delete LinkedList.
 */

package com.mycollections;

import java.util.LinkedList;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        List<Long> myList = new LinkedList<>();

        // Add.
        myList.add(200000000L);
        myList.add(2008765000L);
        myList.add(4566320000L);
        myList.add(80000000098L);
        myList.add(90000000065L);

        // Read.
        System.out.println(myList); // Output: [200000000, 2008765000, 4566320000, 80000000098, 90000000065]

        // Delete first.
        myList.removeFirst();

        // Read.
        System.out.println(myList); // Output: [2008765000, 4566320000, 80000000098, 90000000065]

        // Delete last.
        myList.removeLast();

        // Read.
        System.out.println(myList); // Output: [2008765000, 4566320000, 80000000098]

        // Replace.
        myList.replaceAll((el) -> myList.getFirst() * 2 );

        // Read.
        System.out.println(myList); // Output: [4017530000, 8035060000, 8035060000]

        // Delete all.
        myList.clear();

    }
}