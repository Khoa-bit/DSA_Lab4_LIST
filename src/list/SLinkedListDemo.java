package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SLinkedListDemo {
    public static void main(String[] args) {
        List<Integer> sLinkedList = new SLinkedList<>();
        List<Integer> ArrayList = new MyArrayList<>();
        sLinkedList.add(0);
        ArrayList.add(0);
        sLinkedList.add(1);
        ArrayList.add(1);
        sLinkedList.add(2);
        ArrayList.add(2);
        sLinkedList.add(3);
        ArrayList.add(3);
        sLinkedList.add(4);
        ArrayList.add(4);
        sLinkedList.add(5);
        ArrayList.add(5);
        sLinkedList.add(6);
        ArrayList.add(6);

        System.out.println(ArrayList);
        System.out.println(ArrayList.size());
        ArrayList.clear();
        System.out.println(ArrayList);
        System.out.println(ArrayList.size());

        System.out.println("=============================================");

        System.out.println(sLinkedList);
        System.out.println(sLinkedList.size());
        sLinkedList.clear();
        System.out.println(sLinkedList);
        System.out.println(sLinkedList.size());

        sLinkedList.add(0);
        ArrayList.add(0);
        sLinkedList.add(1);
        ArrayList.add(1);
        sLinkedList.add(2);
        ArrayList.add(2);
        sLinkedList.add(3);
        ArrayList.add(3);
        sLinkedList.add(4);
        ArrayList.add(4);
        sLinkedList.add(5);
        ArrayList.add(5);
        sLinkedList.add(6);
        ArrayList.add(6);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(ArrayList);
        System.out.println(ArrayList.size());

        System.out.println("=============================================");

        System.out.println(sLinkedList);
        System.out.println(sLinkedList.size());
    }
}
