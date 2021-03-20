
package listanp1;

import java.util.Scanner;

/**
 *
 * @author Viviane Viana
 */

//11. Faça um programa que mostre os N termos da sequência de Fibonacci: 0-1-1-2-3-5-
//8-13-21-34-... Note: N é a quantidade de termos dados pelo usuário.

public class Questao11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
	int n, num1, num2, num3;
	num1 = 0;
	num2 = 1;
	num3 = 0;
		
	System.out.println("Digite o número de termos: ");
	n = kb.nextInt();
		
	if (n == 1) {
            System.out.println(num1);
	} else {
            while(n != 0){
                System.out.println(num1);
		num3 = num1 + num2;
		num1 = num2;
		num2 = num3;
		n--;
            }
	}
        kb.close();
    }
}
