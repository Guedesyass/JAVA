package exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
       double numero1, numero2, resto;
       
       //exercicio proposto na aula presencial
       Scanner leitor = new Scanner(System.in);
       
        System.out.print("Calculadora de resto de divisao \n");
         System.out.print("Digite um dividendo:");
         numero1 = leitor.nextDouble();
         
         System.out.print("Digite um divisor:");
         numero2 = leitor.nextDouble();
         
         resto = numero1%numero2;
         
         System.out.print("O resto da divisao: "+resto);
         
         
    }
    
}
