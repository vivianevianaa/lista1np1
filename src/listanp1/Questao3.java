package listanp1;

import java.util.Scanner;

/**
 *
 * @author Viviane Viana
 */

//3. Faça um programa que calcule e mostre a área de um círculo. Nota: sabe-se que a
//área é A = π*r 2.

public class Questao3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
        System.out.println("Insira o raio do círculo: ");
        float raio = kb.nextFloat();
        
        float area = (float) ((float) Math.pow(raio, 2) * Math.PI);
        
        System.out.println("A área do círculo é: " + area + ".");
        
        kb.close();
    }
}