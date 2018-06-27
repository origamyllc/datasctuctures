package dataructure;

public class Queue {


    static class Node {

        private Object data = null;
        private Node next = null ;

        public Node(Object value){
            this.data = value;
            this.next = null;
        }

        public Object getData(){
            return this.data;
        }

    }

    private Node head = null;


    public void enqueue(Object value){
        Node node = new Node(value);
        Node current = null;

        if(this.head == null){
            // check if head is empty
            // if empty create a new node and set as head
            this.head = node;
        } else {
            // check if head is empty
            // if not empty create a new node and set current head as next
            current = node;
            current.next = this.head;
            this.head = current;
        }

    }

    public Object dequeue(){

        Node current = this.head ;
        Node dequed_node = null ;
        Object data = null;

        if( current.next != null ){
            while( current.next.next != null ) {
                current = current.next;
            }
            data = current.next.getData();
            current.next = null;
        } else{
            data = current.getData();
            current.data = null;
        }




        return data;
    }

    public Object front(){
        Node current = this.head ;
        while( current.next != null ){
            current = current.next;
        }
      return current.getData();
    }

    public Object rear(){
        return  this.head.getData();
    }

   public static void main (String args[]){
        Queue q = new Queue();
        q.enqueue("hello");
        q.enqueue("world");
        q.front();
        q.rear();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
   }
}
