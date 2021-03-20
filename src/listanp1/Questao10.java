
package listanp1;

/**
 *
 * @author Viviane Viana
 */

//10. Faça um programa que calcule a diferença entre a soma dos quadrados dos
//primeiros 10 números naturais e o quadrado da soma. Exemplo: a soma dos quadrados dos
//dez primeiros números naturais é: 1 2 + 2 2 + ... + 10 2 = 385 O quadrado da soma dos dez
//primeiros números naturais é: (1 + 2 + ... + 10) 2 = 3025 A diferença entre a soma dos
//quadrados dos dez primeiros números naturais e o quadrado da soma é: 3025 – 385 =
//2640.

public class Questao10 {
    public static void main(String[] args) {
        int somaQ = 0, qSoma = 0;
        
	for (int i = 1; i <= 10; i++) {
            somaQ = (int) (somaQ + Math.pow(i, 2));
	}
        
	for (int i = 1; i <= 10; i++) {
            qSoma = qSoma + i;
	} 
        
	qSoma = (int) Math.pow(qSoma, 2);
        int diferenca = qSoma - somaQ;
	System.out.println("A diferença é: " + diferenca);	
    }
}