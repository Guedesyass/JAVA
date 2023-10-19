package exercicios2;

import javax.swing.JOptionPane;

public class Exercicio18 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inicial: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número final: "));
        int sum = 0;
        
        int i = n1;
        
        while(i < n2){
            sum = sum + i;
            i++;
        }
        
        System.out.print(sum  + "\n");
    }
}
