package stack;

public class MyArrayStack {

    public static final int SEGMENT = 8;

    int[] data;
    int size;

    MyArrayStack() {
        data = new int[SEGMENT];
        size = 0;
    }

    public void push(int value){

        if (data.length == size){
            increaseCapacity();
        }

        data[size]=value;
        size++;
    }

    public void showMyStack(){

        System.out.println("Dimensiunea array-ului este: " + size + "/" + data.length);

        for (int i = 0; i < size; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void increaseCapacity(){

        int[] c = new int[data.length + SEGMENT];

        for (int i = 0; i < data.length; i++){
            c[i]= data[i];
        }
        data = c;

    }

    //afiseaza urmatoarea valoarea care urmeaza sa fie afisata;
    public int peek(){
       return data[size-1];

    }

    //elimina valoarea urmatoare care urmeaza sa fie procesata;
    public int pop(){
        int value = data[size - 1];
        data[size-1]= 0;
        size--;
        return value;
    }
}
