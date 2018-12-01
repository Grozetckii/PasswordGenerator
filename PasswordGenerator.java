/**
 *@date 01.12.2018
 *@author Grozetskiy Denis
 *@version 1.0
 */

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args){

        char[] listBigLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] listSmallLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] listSymbols = {'!', '@', '$', '%', '^', '?', '*', '_', '-', '=', '+'};
        int[] listNumerals = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int quantitySymbols = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a password length! (from 10 to 20 symbols)");

        while ((quantitySymbols < 10) || (quantitySymbols > 20)) {
            quantitySymbols = scan.nextInt();
            if ((quantitySymbols < 10) || (quantitySymbols > 20)) {
                System.out.println("enter again -> FROM 10 TO 20 SYMBOLS !!!");
            }
        }

        scan.close();

        System.out.print("Your password were generated : ");

        for (int i = 0; i < quantitySymbols; i++){
            int generateSequence = (1 + (int) (Math.random() * 4));
            switch (generateSequence) {
                case 1: System.out.print(listBigLetters[(int) (Math.random() * listBigLetters.length)]); break;
                case 2: System.out.print(listSmallLetters[(int) (Math.random() * listSmallLetters.length)]); break;
                case 3: System.out.print(listNumerals[(int) (Math.random() * listNumerals.length)]); break;
                case 4: System.out.print(listSymbols[(int) (Math.random() * listSymbols.length)]); break;
            }
        }
    }

}
