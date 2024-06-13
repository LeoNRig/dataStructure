package dataStructure;

public class LinkedList {

    private Node head;

    private Node tail;

    private int size;

    class Node{

        String data;

        Node next;

        Node(String data){

            this.data = data;

        }
    }
    public LinkedList(String data){
        size = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getHead(){
        if(this.head == null){
            System.out.println("List is empty");
        } else {
            System.out.println("Head" + head.data);
        }
    }
    public void getTail(){
        if(this.tail == null){
            System.out.println("List is empty");
        } else {
            System.out.println("Tail" + tail.data);
        }
    }
    public void getSize() {
        System.out.println("Size: " + this.size);
    }
    public void makeEmpty(){
        head = null;
        tail = null;
        size = 0;
    }
    public void print(){
        System.out.println("####################");
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$");
    }
    public void append(String data){
        Node newNode = new Node(data);
        if(size == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node removeLast(){
        if(size == 0) return null;
        Node pre = head;
        Node temp = null;
        while(pre.next != tail){
            pre = pre.next;
        }
        temp = tail;
        tail = pre;
        tail.next = null;

        size--;
        if(size == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(String data){
        Node newNode = new Node(data);
        if(size == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public Node removeFirst(){
        if(size == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        if(size == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= size) return null;
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, String data){
        Node temp = get(index);
        if(temp != null){
            temp.data = data;
            return true;
        }
        return false;
    }

    public boolean insert(int index, String data){
        if(index < 0 || index > size) return false;
        if(index == 0){
            prepend(data);
            return true;
        }
        if(index == size){
            append(data);
            return true;
        }
        Node newNode = new Node(data);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return true;
    }

    public Node remove(int index){
    if (index < 0 || index >= size) return null;
    if (index == 0)return removeFirst();
    if (index == size - 1) return removeLast();

    Node prev = get(index - 1);
    Node temp = prev.next;

    prev.next = temp.next;
    temp.next = null;
    size--;

    return temp;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList("Elemento 1");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.prepend("Elemento 0");

        list.remove(2);


//        list.insert(3, "Elemento 2.5");

//        System.out.println(list.get(2).data);
//        System.out.println(list.removeFirst().data);

//        list.getHead();
//        list.getTail();
//        list.getSize();
        list.print();
        list.set(1, "Elemento 0.5");
        list.print();
    }

}
