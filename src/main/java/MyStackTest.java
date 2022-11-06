public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("First");
        myStack.push("Second");
        myStack.push("Third");
        myStack.push("Fourth");
        System.out.println("My Stack = " + myStack);

        System.out.println("My Stack size = " + myStack.size());

        System.out.println("The first element of the Stack = " + myStack.peek());

        myStack.pop();
        System.out.println("My Stack after removing the first element = " + myStack);

        myStack.remove(1);
        System.out.println("My Stack after removing the element with index 1 = " + myStack);

        myStack.clear();
        System.out.println("My Stack after cleaning = " + myStack);
    }
}
