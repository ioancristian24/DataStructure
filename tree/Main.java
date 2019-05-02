package tree;

public class Main {

    public static void main(String[] args) {

        MyBinarySearchTree bst = new MyBinarySearchTree();

        bst.root = bst.add(bst.root,5);
        bst.add(bst.root,6);
        bst.add(bst.root,56);
        bst.add(bst.root,11);
        bst.add(bst.root,1);

        bst.showInOrder(bst.root);
        System.out.println();

        bst.showPreOrder(bst.root);
        System.out.println();

        System.out.print(bst.countNodes(bst.root));
        System.out.println();

        bst.showPostOrder(bst.root);
    }
}
