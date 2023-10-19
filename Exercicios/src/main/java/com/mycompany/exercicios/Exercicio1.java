package com.mycompany.exercicios;

import javax.swing.JOptionPane;

public class Exercicios {

    public static void main(String[] args) {
        String name;
        int age;
        
        name = JOptionPane.showInputDialog("Digite seu nome: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        
        
        if(age > 15 && age < 25){
            JOptionPane.showMessageDialog(null, name + " ACEITA.");
        }
        else {
            JOptionPane.showMessageDialog(null, "NÃO ACEITA");
        }
    }
}
