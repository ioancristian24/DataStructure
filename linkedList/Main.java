package linkedList;

public class Main {

    public static void main(String[] args) {

        MyLinkedListStack ml = new MyLinkedListStack();

        System.out.println(ml.getSize());

        ml.add(5);
        ml.add(6);
        ml.add(8);
        ml.add(9);
        ml.add(10);
        ml.add(12);
        ml.add(54);

        System.out.println(ml.getSize());

        ml.show();
        System.out.println(ml.getAt(5));
        ml.showInOrder(ml.start);
        System.out.println();
        ml.showInReverseOrder(ml.start);
    }


}
