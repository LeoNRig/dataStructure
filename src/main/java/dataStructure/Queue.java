package dataStructure;

public class Queue {

    private Node first;

    private Node last;

    private int size;

    public class Node{

        int value;

        Node next;

        private int size;

        Node(int value) {
            this.value = value;
        }
        public int getValue() {return this.value;}
    }

    public Queue(int value){
        Node newMode =  new Node(value);
        first = newMode;
        last = newMode;
        size++;
    }

    public void getFirst() {
        if(first != null){
            System.out.println("First" + first.value);
        } else {
            System.out.println("Empty");
        }
    }

    public void getLast() {
        if(last != null){
            System.out.println("Last" + last.value);
        } else {
            System.out.println("Empty");
        }
    }
    public void getSize() {
        System.out.println("Size" + size);
    }
    public void print() {
        System.out.println("$##$#$#$#$#$#$#");
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("$##$#$#$#$#$#$#$#$#");
    }

    public void enqueue(int value) {
        Node newMode = new Node(value);
        if(size == 0){
            first = newMode;
            last = newMode;
        } else {
            last.next = newMode;
            last = newMode;
        }
        size++;
    }

    public Node dequeue() {
            if(size == 0) return null;
            Node temp = first;
            if(size == 1){
                first = null;
                last = null;
            } else {
                first = first.next;
                temp.next = null;
            }
            size--;
            return temp;
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);

//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getSize();
//        myQueue.print();
    }
}
