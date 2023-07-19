package BasicJava.List;

import java.util.Stack;

public class TestStackClass {
    public static void main(String[] args) {
        Stack<Integer> integerStack =new Stack<Integer>();
        integerStack.push(24);
        integerStack.push(50);
        integerStack.push(100);

        System.out.println("its push() methods  "+integerStack);
        integerStack.pop();
        System.out.println(" its pop() methods "+integerStack);
        System.out.println("its peek() methods "+integerStack.peek());
        System.out.println( "its search () methods "+integerStack.search(60));
        System.out.println("its empty() methods "+ integerStack.empty());
    }
}
