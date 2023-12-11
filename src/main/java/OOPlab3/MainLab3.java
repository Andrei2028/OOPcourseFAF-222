package OOPlab3;

public class MainLab3 {
    public static void main(String[] args) {
        Stack<Integer> arrayStack = new ArrayStack<>();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);

        System.out.println("ArrayStack size: " + arrayStack.size());
        System.out.println("Top element of ArrayStack: " + arrayStack.peek());

        while (!arrayStack.isEmpty()) {
            System.out.println("Popped from ArrayStack: " + arrayStack.pop());
        }

        Stack<String> linkedListStack = new LinkedListStack<>();
        linkedListStack.push("Hello");
        linkedListStack.push("World");

        System.out.println("LinkedListStack size: " + linkedListStack.size());
        System.out.println("Top element of LinkedListStack: " + linkedListStack.peek());

        while (!linkedListStack.isEmpty()) {
            System.out.println("Popped from LinkedListStack: " + linkedListStack.pop());
        }
    }
}
