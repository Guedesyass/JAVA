
package exercicios2;

import javax.swing.JOptionPane;

public class Q1 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int numero2;
        int soma = 0;
      
        do {
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número diferente: ")); 
        } while (numero1 == numero2);

        int min, max;

        if (numero1 < numero2) {
            min = numero1;
            max = numero2;
        } else {
            min = numero2;
            max = numero1;
        }

        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        JOptionPane.showMessageDialog(null, "A soma dos números pares no intervalo entre " +min+ " e " +max+ " é: " + soma);

    }
}