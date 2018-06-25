package dataructure;

// create a stack using a linked list

public class Stack {

    private  Node head = null;

    public  static class Node {

        private Object data = null;
        private Node next = null ;

        public  Node(Object data){
            this.data = data ;
            this.next = null;
        }

        public Object getData(){
            return this.data;
        }

    }

    // if the stack is empty

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    // create a new node
    // check the top
    // if top is empty set the node as top
    // else if not empty create a new node
    // and set node.next as head

    public void push(Object value ){

        Node node = new Node (value);

        if(head != null){
            node.next = head;
        }
        head = node;

    }

    // set the next node as head
    // set next of current node as null

    public Object pop(){
        Node current ;
        current = head;
        head = head.next;
        current.next = null;
        return current.getData();
    }

    public Object peek(){
        return head.getData();
    }

    public static void main (String args []){

        Stack stack = new Stack();
        stack.push('3');
        stack.push('4');
        stack.push('4');
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}
