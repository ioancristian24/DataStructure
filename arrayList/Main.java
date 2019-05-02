package arrayList;

public class Main {

    public static void main(String[] args) {

        MyArray ma = new MyArray();
        ma.showArray();

        ma.add(5);
        ma.showArray();
        ma.add(8);
        ma.showArray();
        ma.add(1);
        ma.showArray();
        ma.add(4);
        ma.showArray();
        ma.add(3);
        ma.showArray();
        ma.add(4);
        ma.showArray();
        ma.add(6);
        ma.showArray();
        ma.add(2);
        ma.showArray();
        ma.add(10);
        ma.showArray();
        ma.add(11);
        ma.showArray();
        ma.add(56);
        ma.showArray();
        ma.add(89);
        ma.showArray();
        ma.add(45);
        ma.showArray();
        ma.add(44);
        ma.showArray();
        ma.add(39);
        ma.showArray();
        ma.setAt(7, 35);
        System.out.println(ma.getAt(7));

        ma.removeAt(2);
        ma.showArray();
    }
}
