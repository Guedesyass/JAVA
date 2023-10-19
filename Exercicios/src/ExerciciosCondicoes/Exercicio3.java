package exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {
     public static void main(String[] args) {
    String nome;
    
    nome = JOptionPane.showInputDialog( "Digite seu nome");
    
    JOptionPane.showMessageDialog(null, "O nome do usuário é: "+nome);
    
    }
}
