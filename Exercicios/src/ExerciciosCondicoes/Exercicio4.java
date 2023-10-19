package exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args ) {
        int num1, num2, soma;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo um valor:"));
        
        soma = num1+ num2;
        JOptionPane.showMessageDialog(null, "O resultado é: " +soma);
    }
}
