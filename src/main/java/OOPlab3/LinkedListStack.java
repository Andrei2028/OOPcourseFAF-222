package OOPlab3;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    private LinkedList<T> elements;

    public LinkedListStack() {
        elements = new LinkedList<>();
    }

    @Override
    public void push(T element) {
        elements.addLast(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.removeLast();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.getLast();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }
}
