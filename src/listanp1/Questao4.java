package listanp1;

import java.util.Scanner;

/**
 *
 * @author Viviane Viana
 */

//4. Faça um programa que leia um número e, caso seja positivo, calcule e mostre:
//a. O quadrado do número digitado
//b. A raiz quadrada do número

public class Questao4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro: ");
        float num = kb.nextFloat();
        
        if (num > 0) {
            float quadrado = num * num;
            float raizQuadrada = (float) Math.sqrt(num);
            
            System.out.println("O quadrado do número: " + quadrado);
            System.out.println("A raiz quadrada do número: " + raizQuadrada);
        } else {
            System.out.println("É necessário inserir um valor positivo.");
        }
        
        kb.close();
    }
}
