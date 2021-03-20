
package listanp1;

import java.util.Scanner;

/**
 *
 * @author Viviane Viana
 */

//9. Faça um programa para calcular a média aritmética M entre duas notas de um aluno
//e mostrar sua situação, que pode ser Aprovado (M ≥ 7), Reprovado (M < 4) e Final (4 ≤ M <
//7). Se o aluno ficar de Final, entre com a nota da prova Final e mostre a média e o resultado
//final.

public class Questao9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Digite a nota 1: ");
        float nota1 = kb.nextFloat();
        
        System.out.println("Digite a nota 2: ");
        float nota2 = kb.nextFloat();
        
        float media = (nota1 + nota2) / 2;
        
        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else {
            if (media < 4.0) {
                System.out.println("Reprovado!");
            } else {
                System.out.println("Digite a nota da prova final: ");
                float notaFinal = kb.nextFloat();
                float mediaFinal = (notaFinal + media) / 2;
                
                if (mediaFinal >= 7) {
                    System.out.println("A média final é: " + mediaFinal);
                    System.out.println("Aprovado!");
                } else {
                    System.out.println("A média final é: " + mediaFinal);
                    System.out.println("Reprovado!");
                }
            }
        }
        kb.close();
    }
}
