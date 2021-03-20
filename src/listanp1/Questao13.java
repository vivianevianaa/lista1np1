
package listanp1;

import java.util.Scanner;

/**
 *
 * @author Viviane Viana
 */

//13. Faça um programa que apresente um menu de opções para cálculo das seguintes
//operações entre dois números:
//a. Adição (opção 1)
//b. Subtração (opção 2)
//c. Multiplicação (opção 3)
//d. Divisão (opção 4)
//e. Saída (opção 5)
//O programa deve possibilitar ao usuário a escolha da operação desejada e a
//exibição do resultado.

public class Questao13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int opcao, operacao, num1, num2;
        
        do {
            System.out.println("Selecione a opção desejada e digite dois valores.");
            System.out.println("1 - Adição | "
                             + "2 - Subtração | "
                             + "3 - Multiplicação | "
                             + "4 - Divisão | "
                             + "5 - Sair");
            
            System.out.println("Opção: ");
            opcao = kb.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Valor 1: ");
                    num1 = kb.nextInt();
                    System.out.println("Valor 2: ");
                    num2 = kb.nextInt();
                    operacao = num1 + num2;
                    
                    System.out.println("Você escolheu 'Adição'. O resultado é: " + operacao);
                    break;
                case 2:
                    System.out.println("Valor 1: ");
                    num1 = kb.nextInt();
                    System.out.println("Valor 2: ");
                    num2 = kb.nextInt();
                    operacao = num1 - num2;
                    
                    System.out.println("Você escolheu 'Subtração'. O resultado é: " + operacao);
                    break;
                case 3:
                    System.out.println("Valor 1: ");
                    num1 = kb.nextInt();
                    System.out.println("Valor 2: ");
                    num2 = kb.nextInt();
                    operacao = num1 * num2;
                    
                    System.out.println("Você escolheu 'Multiplicação'. O resultado é: " + operacao);
                    break;
                case 4:
                    System.out.println("Valor 1: ");
                    num1 = kb.nextInt();
                    System.out.println("Valor 2: ");
                    num2 = kb.nextInt();
                    operacao = num1 / num2;
                    
                    System.out.println("Você escolheu 'Divisão'. O resultado é: " + operacao);
                    break;
                case 5:
                    System.out.println("Você escolheu 'Sair'. Até mais.");
                    break;
                }
            } while (opcao != 5);
        kb.close();
    }
}