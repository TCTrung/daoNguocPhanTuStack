package src;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("---Dao nguoc so---");

        System.out.println("Mang 1: " + stack);

        int n = stack.size();
        for (int i = 0; i < n ; i++) {
            stack2.push(stack.pop());
        }
        System.out.println("Mang 2: " + stack2);

        Stack<String> stack3 = new Stack<>();
        Stack<String> stack4 = new Stack<>();
        stack3.push("HI");
        stack3.push("hi");
        stack3.push("hello");
        stack3.push("HELLO");

        System.out.println("---Dao nguoc chuoi---");

        System.out.println("Mang 1: " + stack3);

        int m = stack3.size();
        for (int i = 0; i < m ; i++) {
            stack4.push(stack3.pop());
        }
        System.out.println("Mang 2: " + stack4);
    }
}
