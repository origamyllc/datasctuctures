package dataructure.stack;

import java.util.Stack;

public class StackTest {

    private static Stack stack ;

    public static void main (String args[]){
        stack = new Stack();
        stack.push("world");
        stack.push("hello");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
