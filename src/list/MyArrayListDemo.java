package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new MyArrayList<>();
        for (int idx = 0; idx < 10; idx++) {
            list.add(idx);
        }

        ListIterator<Integer> listIterator = list.listIterator();
        System.out.print("Before modification: ");
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int item = listIterator.next();
            if (item % 2 == 0) {
                listIterator.set(item * 10);
            } else {
                listIterator.remove();
            }
        }

        listIterator = list.listIterator();
        System.out.print("After modification: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
    }
}
