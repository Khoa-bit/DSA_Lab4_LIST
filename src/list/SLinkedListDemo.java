package list;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SLinkedListDemo {
    public static void main(String[] args) {
        List<Integer> sLinkedList = new SLinkedList<>();
        List<Integer> myArrayList = new MyArrayList<>();
        sLinkedList.add(0);
        myArrayList.add(0);
        sLinkedList.add(1);
        myArrayList.add(1);
        sLinkedList.add(2);
        myArrayList.add(2);
        sLinkedList.add(3);
        myArrayList.add(3);
        sLinkedList.add(4);
        myArrayList.add(4);
        sLinkedList.add(5);
        myArrayList.add(5);
        sLinkedList.add(6);
        myArrayList.add(6);

        System.out.println(myArrayList);
        ListIterator<Integer> arrIterator = myArrayList.listIterator();
        System.out.println(arrIterator.next());
        System.out.println(arrIterator.next());
//        arrIterator.set(77);
        arrIterator.add(77);
        System.out.println(arrIterator.next());
        System.out.println(arrIterator.next());
        System.out.println(arrIterator.next());
        System.out.println(arrIterator.previous());
        System.out.println(arrIterator.previous());
//        arrIterator.set(99);
        arrIterator.add(99);
        System.out.println(myArrayList);

        System.out.println("=============================================");

        System.out.println(sLinkedList);
        ListIterator<Integer> iterator = sLinkedList.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
//        iterator.set(77);
        iterator.add(77);
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        System.out.println(iterator.previous());
//        iterator.set(99);
        iterator.add(99);
        System.out.println(sLinkedList);

    }
}
