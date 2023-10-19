package exercicios;

import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args ) {
        double salario, parcela;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário"));
        parcela = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da parcela:"));
        
        if (parcela <= (salario/100)*30){
            JOptionPane.showMessageDialog(null, "Emprestimo concedido.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Emprestimo não concedido.");
        }
    }
}
