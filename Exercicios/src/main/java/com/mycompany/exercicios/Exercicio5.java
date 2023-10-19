
package com.mycompany.exercicios;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
       int[] n = new int[3];
       int maior = Integer.MIN_VALUE;
       
       for( int i = 0; i < n.length ; i++ ){
           n[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
           if(n[i] > maior){
               maior = n[i];
           }
       }
       
       JOptionPane.showMessageDialog(null, maior);
       
    }
}
