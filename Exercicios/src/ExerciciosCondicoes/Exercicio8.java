package exercicios;

import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args ) {
        int anoNascimento, anoAtual, idade;
        
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que estamos: "));
        
        if(anoAtual == 2023){
            if(anoAtual > anoNascimento){
                idade = anoAtual - anoNascimento;
                JOptionPane.showMessageDialog(null, "Você tem "+idade+ " anos.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Digite um ano de nascimento válido.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Ano inválido.");
        }
    }
}
