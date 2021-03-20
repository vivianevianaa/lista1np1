
package listanp1;

import java.util.Scanner;

/**
 *
 * @author Viviane Viana
 */

//6. Um programa para gerenciar os saques de um caixa eletrônico deve possuir algum
//mecanismo para decidir o número de notas de cada valor que deve ser disponibilizado para
//o cliente que realizou o saque. Um possível critério seria o da “distribuição ótima” no sentido
//de que as notas de menor valor sejam distribuídas em número mínimo possível. Escreva um
//programa que leia o valor da quantia solicitada e imprima na tela a distribuição das notas de
//acordo com o critério acima. Considere apenas a existência das notas de R$50, R$10, R$5
//e R$1 no caixa eletrônico.
//Exemplo: Ao digitar R$87, a impressão deve mostrar:
//Nota50 = 1
//Nota10 = 3
//Nota5 = 1
//Nota1 = 2

public class Questao6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Quanto você deseja sacar? ");
        int valor = kb.nextInt();
        
        int nota50 = 50, nota10 = 10, nota5 = 5, nota1 = 1;

        int n50 = valor / nota50;
        valor = valor % nota50;
        
        int n10 = valor / nota10;
        valor = valor % nota10;
                
        int n5 = valor / nota5;
        valor = valor % nota5;
        
        int n1 = valor / nota1;
  
        
        System.out.println("Nota(s) de 50: " + n50);
        System.out.println("Nota(s) de 10: " + n10);
        System.out.println("Nota(s) de 5: " + n5);
        System.out.println("Nota(s) de 1: " + n1);
        
        kb.close();
    }
}