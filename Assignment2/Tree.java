public class Tree {

    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode root;
    public Tree(TreeNode root) {

        this.root = root;
    }

    public static void print(TreeNode root){ //im using inorder traversal for the print order
        if (root.left!=null){
            print(root.left);
            //System.out.print(root.left.data + " ");
        }

        System.out.print(root.data+" ");

        if (root.right!=null){
            print(root.right);
            //System.out.print(root.right.data + " ");
        }
    }

    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(6, null, null);
        TreeNode rightChild = new TreeNode(3, null, null);
        TreeNode left = new TreeNode(7, null, null);
        TreeNode right = new TreeNode(17, leftChild, rightChild);
        TreeNode root = new TreeNode(1, left, right);
        Tree tree = new Tree(root);
        print(root);
    }



}
