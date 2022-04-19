package package21_collections;

import java.util.LinkedList;

public class C01_LinkedList {
    public static void main(String[] args) {

        // hem List, hem de Queue'nun child class'idir

        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10); // add method'u List'den geldigi icin hep sona ekler
        list.addFirst(11); // addFirst deque'den gelir
        list.addLast(12); // addLast deque'den gelir

        list.addFirst(13); // addFirst deque'den'
        System.out.println(list); // [13,11, 5, 10, 12]

        list.add(2,25); // [13, 11, 25, 5, 10, 12]

        System.out.println(list);
    }
    }

