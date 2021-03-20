
package listanp1;

import java.util.Scanner;

/**
 *
 * @author Viviane Viana
 */

// 12. Faça um programa que leia um valor digitado e calcule o fatorial deste
// número.

public class Questao12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int val = kb.nextInt();

        int fat = 1;

        while (val > 1) {
            fat = fat * val;
            val--;
        }

        System.out.println("Fatorial: " + fat);

        kb.close();
    }
}
