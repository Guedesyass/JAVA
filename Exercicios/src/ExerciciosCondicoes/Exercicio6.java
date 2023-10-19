package exercicios;

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args ) {
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número: "));
        
        if(n1 > n2){
            JOptionPane.showMessageDialog(null, "O primeiro número " +n1+ " é maior que o segundo " +n2);
        }
        else if(n1 < n2){
            JOptionPane.showMessageDialog(null, "O segundo número " +n2+ " é maior que o primeiro " +n1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Os números são iguais.");
        }
    }
}
