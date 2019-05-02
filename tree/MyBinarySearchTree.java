package tree;

public class MyBinarySearchTree {

    Node root;

    public Node add(Node n, int value) {

        if (n == null) {
            n = new Node(value);
        } else {
            if (value < n.info) {
                n.left = add(n.left, value);
            } else {
                n.right = add(n.right, value);
            }
        }
        return n;
    }

    public void showInOrder(Node n){
        if (n != null){
            showInOrder(n.left);
            System.out.print(n.info + " ");
            showInOrder(n.right);
        }
    }

    public void showPreOrder (Node n){
        if (n != null){
            System.out.print(n.info + " ");
            showPreOrder(n.left);
            showPreOrder(n.right);
        }
    }

    public void showPostOrder (Node n){
        if (n != null){
            showPostOrder(n.left);
            showPostOrder(n.right);
            System.out.print(n.info + " ");
        }
    }

    public int countNodes(Node n){
        int count = 0;
        if (n != null){
            countNodes(n.left);
            countNodes(n.right);
            count = count + countNodes(n.left) + countNodes(n.right) + 1;
        }
        return count;
    }
}