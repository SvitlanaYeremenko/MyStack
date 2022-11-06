import java.util.Arrays;

public class MyStack<E> implements MyInterfaceToStack {
    private int size = 0;
    private MyStack.Node<E> first = null;

    private static class Node<E> {
        E item;
        MyStack.Node<E> next;
    }

    @Override
    public void push(Object value) {
        MyStack.Node<E> oldFirst = first;
        first = new Node<>();
        first.item = (E) value;
        first.next = oldFirst;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index == size - 1) {
            removeTopElement ();
        } else if (index >= 0 && index < size - 1) {
            MyStack.Node<E> oldFirst = first;
            for (int i = size - 1; i > index + 1; i--) {
                oldFirst = oldFirst.next;
            }
            E element = oldFirst.item;
            MyStack.Node<E> next = oldFirst.next;
            if (next == null) {
                return;
            } else {
                oldFirst.next = oldFirst.next.next;
            }
            size--;
        }
    }

    @Override
    public void clear() {
        for (MyStack.Node<E> oldFirst = first; oldFirst != null; ) {
            MyStack.Node<E> next = oldFirst.next;
            oldFirst.item = null;
            oldFirst.next = null;
            oldFirst = next;
        }
        first = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object peek() {
        E element = first.item;
        return element;
    }

    @Override
    public Object pop() {
        E element = first.item;
        removeTopElement ();
        return element;
    }

    private void removeTopElement () {
        if (first != null) {
            E element = first.item;
            first = first.next;
            size--;
        }
    }

    @Override
    public String toString() {
        Object[] result = new Object[size];
        int i = 0;
        for (MyStack.Node<E> oldFirst = first; oldFirst != null && i < size; oldFirst = oldFirst.next) {
            result[i++] = oldFirst.item;
        }
        return Arrays.toString(result);
    }
}
