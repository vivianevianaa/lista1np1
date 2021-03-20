
package listanp1;

import java.util.Scanner;

/**
 *
 * @author Viviane Viana
 */

// 8. Faça um programa que calcule as raízes da equação de 2 o grau.
// Lembre-se que: x = (−b ± √Δ)/2a onde Δ = b 2 – 4ac
// E ax 2 + bx + c = 0 representa uma equação do 2 o grau. A variável ’a’ tem
// que ser diferente
// de zero. Caso seja igual, imprima a mensagem “Não é equação do segundo grau”.
// Se Δ < 0,
// não existe real. Imprima a mensagem “Não existe raiz”. Se Δ = 0, existe uma
// raiz real.
// Imprima a raiz e a mensagem Raiz Única. Se Δ >= 0, imprima as duas raízes.

public class Questao8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Digite a variável A da equação:");
        int a = kb.nextInt();
        System.out.println("Digite a variável B da equação:");
        int b = kb.nextInt();
        System.out.println("Digite a variável C da equação:");
        int c = kb.nextInt();

        if (a == 0) {
            System.out.println("Não é equação de segundo grau.");
        } else {
            float delta = b * b - (4 * a * c);
            System.out.println("Delta: " + delta);
            if (delta < 0) {
                System.out.println("Não existe raiz.");
            } else if (delta == 0) {
                float raiz = (float) (((b * -1) + Math.sqrt(delta)) / (2 * a));
                System.out.println("Raiz única. A raiz: " + raiz);
            } else {
                float raiz1 = (float) (((b * -1) + Math.sqrt(delta)) / (2 * a));
                float raiz2 = (float) (((b * -1) - Math.sqrt(delta)) / (2 * a));

                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }
        kb.close();
    }
}
