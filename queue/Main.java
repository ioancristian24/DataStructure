package queue;

public class Main {

    public static void main(String[] args) {

        MyLinkedListQueue myQueue = new MyLinkedListQueue();

        myQueue.push(5);
        myQueue.push(9);
        myQueue.push(10);
        myQueue.push(23);
        myQueue.push(45);
        myQueue.push(52);

        myQueue.showQueue();

        System.out.println("Valoarea care urmeaza sa fie procesata este: " + myQueue.peek());

        System.out.println("Valoarea care se elimina pentru a fi procesata; " + myQueue.pop());

        myQueue.push(52);
        myQueue.push(31);

        myQueue.showQueue();

        System.out.println("Valoarea care se elimina pentru a fi procesata: " + myQueue.pop());

        myQueue.showQueue();

    }

}
