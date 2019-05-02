package HomeWork4;

import java.util.Scanner;

public class NumberOfDigits {

    public int getNumberOfDigits(int number) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        number = scanner.nextInt();

        String n = "";
        n = Integer.toString(number);

        for (int i = 0; i < n.length(); i++) {
        }
        System.out.println("Numarul cifrelor pentru valoarea introdusa este: " + n.length());
        return number;
    }

}
