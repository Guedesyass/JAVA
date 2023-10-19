package com.mycompany.exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro um número: "));
        
        if(n1 > n2){
            JOptionPane.showMessageDialog(null, n1);   
        }
        else if (n1<n2){
            JOptionPane.showMessageDialog(null, n2);         
        }
        else{
            JOptionPane.showMessageDialog(null, "Os números são iguais!");
        }
    }
}
