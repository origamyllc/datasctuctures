package dataructure.stack;

// create a stack using a linked list

public class CreateStackUsingSinglyLinkedLists {


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

    public static  class Stack {

        Node head = null;

        // if the stack is empty
        public boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }

        public void push(Object value ){

            // create a new node
            // check the top
            // if top is empty set the node as top
            // else if not empty create a new node
            // and set node.next as head

            Node node = new Node (value);

            if(head != null){
                node.next = head;
            }
            head = node;

        }


        public Object pop(){
            Node current ;
            Object data;
            // set the next node as head
            // set next of current node as null
            current = head;
            head = head.next;
            current.next = null;
            return current.getData();
        }

        public Object peek(){
            return head.getData();
        }


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

         // if the stack head is empty set node ad head

    }
}
