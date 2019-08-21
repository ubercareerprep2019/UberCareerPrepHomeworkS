public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(Node root){
        this.root = root;
    }

    public Node getRoot(){
        return root;
    }

    public void insert(int key) {
        Node addNode = new Node(key, null, null); //form a node that will contain the key
        if (getRoot() == null){ //if the root is null then this node becomes the root
            root = addNode;
        }
        else{
            if (key > root.key){ //root is not null,key is bigger than the root so go to right subtree
                if(root.right == null){
                    root.right = insert(key);
                }
            }
            if (key < root.key){
                if (root.left == null){
                    root.left = insert(key);
                }
            }
        }

    }

    public boolean find(int key) {
        Node currentNode = new Node(key,null, null);
        Node leftSide = currentNode.getLeft();
        Node rightSide = currentNode.getRight();
        if (key == currentNode.key)
            return true;
        else if (key < currentNode.key) {
            if (currentNode.left == null)
                return false;
            else
                return leftSide.find(key);
        } else if (key > currentNode.key) {
            if (key = null)
                return false;
            else
                return rightSide.find(key);
        }
        return false;
    }

    public static class Node {
        public int key;
        public Node left;
        public Node right;

        public Node(int key, Node left, Node right){
            this.key = key;
            this.left = left;
            this.right = right;
        }

        public Node getLeft(){
            return left;
        }
        public Node getRight(){
            return right;
        }
    }

    public static void print(Node root){ //im using inorder traversal for the print order
        if (root.left!=null){
            print(root.left);
            //System.out.print(root.left.data + " ");
        }

        System.out.print(root.key+" ");

        if (root.right!=null){
            print(root.right);
            //System.out.print(root.right.data + " ");
        }
    }

    public static void main(String args[]){
        Node leftChild = new Node(6, null, null);
        Node rightChild = new Node(3, null, null);
        Node left = new Node(7, null, null);
        Node right = new Node(17, leftChild, rightChild);
        Node root = new Node(1, left, right);
        BinarySearchTree tree = new BinarySearchTree(root);
        tree.insert(19);
        print(root);
    }

}
