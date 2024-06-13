package dataStructure;

public class Tree {

    public Node root;

    public static class Node{


        public int value;

        public Node left;

        public Node right;
        public Node(int value) {
            this.value = value;
        }

        public boolean isLeaf(Node node){
            return node.left == null && node.right == null;
        }
    }

    public void insert(int value) {
        if(root == null) root = new Node(value);
        else {
            Node newMode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (queue.size() > 0) {
                Node currentNode = queue.remove();
                if(currentNode.left == null) {
                    currentNode.left = newMode;
                }else {
                    queue.add(currentNode.left);
                }
                if(currentNode.right == null) {
                    currentNode.right = newMode;
                }else {
                    queue.add(currentNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);

        System.out.println(tree.root.value);
        System.out.println(tree.root.left.value);
        System.out.println(tree.root.right.value);
    }
}
