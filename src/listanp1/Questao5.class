
package listanp1;

import java.util.Scanner;

/**
 *
 * @author Viviane Viana
 */

//5. Faça um programa que pergunte quanto você ganha por hora e o número de horas
//trabalhadas por mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se
//que são descontados 11% para o Imposto de Renda (IR), 8% para o INSS e 5% para o
//sindicato. Seu programa deve seguir o modelo de saída abaixo:
//+ Salário Bruto: R$
//- IR (11%): R$
//- INSS (8%): R$
//- Sindicato (5%): R$
//= Salário Líquido: R$
//Obs.: Salário Bruto - Descontos = Salário Líquido

public class Questao5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Quanto você ganha por hora trabalhada?");
        float valorHora = kb.nextFloat();
        
        System.out.println("Quantas horas você trabalhou nesse mês?");
        float qtdHoras = kb.nextFloat();
        
        float salarioBruto = valorHora * qtdHoras;
        
        float taxaIR = (float) (salarioBruto * 0.11);
        float taxaINSS = (float) (salarioBruto * 0.08);
        float taxaSIND = (float) (salarioBruto * 0.05);
        
        float descontos = taxaIR + taxaINSS + taxaSIND;
        
        float salarioLiquido = salarioBruto - descontos;
        
        System.out.println("+ Salário Bruto: R$ " + salarioBruto);
        System.out.println("- IR (11%): R$ " + taxaIR);
        System.out.println("- INSS (8%): R$ " + taxaINSS);
        System.out.println("- Sindicato (5%): R$ " + taxaSIND);
        System.out.println("= Salário Líquido: R$ " + salarioLiquido);
        
        kb.close();
    } 
}
