package linkedList;

public class MyLinkedListStack {

    Node start;

    public int getSize() {

        int size = 0;
        Node n = start;

        while (n != null) {
            size++;
            n = n.next;
        }
        return size;

    }

    public void add(int value) {

        Node newNode = new Node(value);

        if (start == null) {
            start = newNode;
        } else {
            Node n = start;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }

    }

    public void show() {

        Node n = start;

        while (n != null) {
            System.out.print(n.info + " ");
            n = n.next;
        }
        System.out.println();
    }

    public int getAt(int index) {

        Node n = start;
        int nrNode = 0;

        while (n != null && nrNode < index) {
            n = n.next;
            nrNode++;
        }
        return n.info;

    }

    //recursivitate

    public void showInOrder(Node n) {
        if (n == null) {
            return;
        } else {
            System.out.print(n.info + " ");
            showInOrder(n.next);
        }
    }

    public void showInReverseOrder(Node n) {
        if (n == null){
            return;
        } else {
            showInReverseOrder(n.next);
            System.out.print(n.info + " ");

        }
    }
}