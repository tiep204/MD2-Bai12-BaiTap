public class MainNode {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.insert(8);
        binaryTree.insert(10);
        binaryTree.insert(6);
        binaryTree.insert(12);
        binaryTree.insert(5);
        binaryTree.insert(7);
        binaryTree.postorder(binaryTree.getRoot());
    }
}

