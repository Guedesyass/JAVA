package exercicios2;

import javax.swing.JOptionPane;

public class Exercicio14 {
        public static void main(String[] args) {
        
            String frase;
            int numero;
            
            frase = JOptionPane.showInputDialog("Digite uma frase: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            
            for(int i = 0; i < numero; i ++){
                JOptionPane.showMessageDialog(null, frase);
            }
        
        }
}