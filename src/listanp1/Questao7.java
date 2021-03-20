
package listanp1;

import java.util.Scanner;

/**
 *
 * @author Viviane Viana
 */

//7. Faça um programa que leia o salário de um trabalhador e o valor da prestação de um
//empréstimo. Se a prestação for maior que 20% do salário imprima: Empréstimo não
//concedido, caso contrário imprima: Empréstimo concedido.

public class Questao7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Digite o seu salário: ");
        float salario = kb.nextFloat();
        
        System.out.println("Quanto de prestação você quer?");
        float prestacao = kb.nextFloat();
        
        
        float valorMaximo = (float) (salario * 0.20);
        
        if (prestacao <= valorMaximo) {
            System.out.println("Empréstimo concedido.");
        } else {
            System.out.println("Empréstimo não concedido.");
        }
        
        kb.close();
    }
}
