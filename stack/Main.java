package stack;


public class Main {

    public static void main(String[] args) {

        MyArrayStack ms = new MyArrayStack();
        MyLinkedListStack ml = new MyLinkedListStack();

        ms.push(7);
        ms.push(1);
        ms.push(9);
        ms.push(6);

        ms.showMyStack();

        ms.push(5);
        ms.push(45);

        ms.showMyStack();

        System.out.println("Valoarea care urmeaza sa fie procesata: " + ms.peek());

        ms.push(45);
        ms.push(62);

        ms.showMyStack();

        System.out.println("Valoarea care va fi eliminata: " + ms.pop());

        ms.showMyStack();

        ms.push(23);

        ms.showMyStack();

        ml.pushStack(23);
        ml.pushStack(52);
        ml.pushStack(56);
        ml.pushStack(47);

        ml.showStack();

        System.out.println("Valoarea care este fi eliminata: " + ml.popStack());

        ml.showStack();

    }
}
