package list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SLinkedList<E> implements List<E> {
    Node<E> head;
    Node<E> tail;
    int size;

    public SLinkedList() {
        head = new Node<>(null, null);
        tail = new Node<>(null, null);
        head.next = tail;
        tail.next = head;
        size = 0;
    }

    //    Utilities (Private)
    private void checkValidIndex(int index) {
        if ((index < 0) || (index >= size)) {
            String message = String.format("Invalid index (=%d)", index);
            throw new IndexOutOfBoundsException(message);
        }
    }

    private Node<E> getDataNode(int index) {
        checkValidIndex(index);
        Node<E> curNode = head.next;
        for (int i = 0; i < index; i++) {
            curNode = curNode.next;
        }
        return curNode;
    }

//    getNode: can return head
    private Node<E> getNode(int index) {
//        Check Valid Index (including head)
        if ((index < -1) || (index >= size)) {
            String message = String.format("Invalid index (including head) (=%d)", index);
            throw new IndexOutOfBoundsException(message);
        }
//        Get Node
        Node<E> curNode = head;
        for (int i = -1; i < index; i++) {
            curNode = curNode.next;
        }
        return curNode;
    }

    private void addAfter(Node<E> afterThis, Node<E> newNode) {
        newNode.next = afterThis.next;
        afterThis.next = newNode;
        if (newNode.next == tail) {
            tail.next = newNode;
        }
        size += 1;
    }

    private Node<E> removeAfter(Node<E> afterThis) {
        Node<E> removedNode = afterThis.next;
        afterThis.next = removedNode.next;
        if (removedNode.next == tail) {
            tail.next = afterThis;
        }
        removedNode.next = null;
        return removedNode;
    }

//    Utilities
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        Node<E> lastNode = tail.next;
        Node<E> newNode = new Node<>(null, e);
        addAfter(lastNode , newNode);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> prev = head;
        Node<E> cur = head.next;
        while (cur != tail && !cur.equals(o)) {
            prev = cur;
            cur = cur.next;
        }
        removeAfter(prev);
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {
        Node<E> prevNode = getNode(index - 1);
        Node<E> newNode = new Node<>(null, element);
        addAfter(prevNode, newNode);
    }

    @Override
    public E remove(int index) {
        checkValidIndex(index);
        Node<E> prevNode = getNode(index - 1);
        return removeAfter(prevNode).element;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
