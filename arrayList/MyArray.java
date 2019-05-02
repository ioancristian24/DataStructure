package arrayList;

import javax.swing.text.Segment;

public class MyArray {

    public static final int SEGMENT = 8;

    int[] a;
    int size;

    MyArray() {
        a = new int[SEGMENT];
        size = 0;
    }

    public void showArray() {
        System.out.println("Dimensiunea array-lui este: " + size + "/" + a.length);

        for (int i = 0; i < size; i++) {

            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void add(int value) {

        if (a.length == size) {
            increaseCapacity();
        }

        a[size] = value;
        size++;

    }

    public void increaseCapacity() {

        int[] b = new int[a.length + SEGMENT];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        a = b;
    }

    public void setAt(int index, int value) {
        a[index] = value;
    }

    public int getAt(int index) {
        return a[index];

    }

    public void removeAt (int index){
        for (int i = index; i < size-1; i++){
            a[i] = a[i+1];
        }
        a[size - 1] = 0;
        size--;
    }
}