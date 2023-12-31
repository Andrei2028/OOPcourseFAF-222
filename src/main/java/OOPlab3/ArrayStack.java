package OOPlab3;

import java.util.ArrayList;

public class ArrayStack<T> implements Stack<T> {
    private ArrayList<T> elements;

    public ArrayStack() {
        elements = new ArrayList<>();
    }

    @Override
    public void push(T element) {
        elements.add(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
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
