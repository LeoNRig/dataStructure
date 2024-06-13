package dataStructure;

public class Stack {
    private Node top;
    private int heigh;

    class Node {
        int value;

        Node next;

        Node(int value) {
            this.value = value;
        }
    }
        public Stack(int value) {
            Node newNode = new Node(value);
            top = newNode;
            heigh = 1;
        }

        public void getTop() {
        if (top == null) {
            System.out.println("Pilha vazia");
        } else {
            System.out.println("topo" + top.value);
        }
        }
        public void getHeigh() {
            System.out.println("Altura" + heigh);
        }
        public void print() {
            System.out.println("$$$$$$$$$$$$$$$$$$");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
        }
            System.out.println("$$$$$$$$$$$$$$$$$$");
        }

        public void push(int value) {
        Node newNode = new Node(value);
        if (heigh == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        heigh++;
        }
        public Node pop() {
        if (heigh == 0)return null;

            Node temp = top;
            top = top.next;
            temp.next = null;
            heigh--;

            return temp;

        }

    public static void main(String[] args) {
        Stack mystack = new Stack(5);
//        mystack.getTop();
//        mystack.getHeigh();
//        mystack.print();
//
//        mystack.push(1);
//
//        mystack.print();
//        mystack.getTop();

        mystack.push(1);
        System.out.println(mystack.pop().value);

    }
    }


