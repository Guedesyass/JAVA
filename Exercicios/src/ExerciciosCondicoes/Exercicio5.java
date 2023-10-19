package exercicios;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args ) {
    double peso, altura, IMC;
    
    peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
    
    IMC = peso/(altura*altura);
    
    JOptionPane.showMessageDialog(null, "Seu IMC é:" +IMC);
    }
}
