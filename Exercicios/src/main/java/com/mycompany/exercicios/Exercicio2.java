package com.mycompany.exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        String profissao;

        profissao = JOptionPane.showInputDialog("Digite sua profissão: ");
        
        switch (profissao.toLowerCase()){
            case "engenheiro":
            JOptionPane.showMessageDialog(null, "Tibúrcio é "+profissao);
            break;
            case "médico":
            JOptionPane.showMessageDialog(null, "Tibúrcio é "+profissao);
            break;
            case "designer":
            JOptionPane.showMessageDialog(null, "Tibúrcio é "+profissao);
            break;
            case "programador":
            JOptionPane.showMessageDialog(null, "Tibúrcio é "+profissao);
            break;
            case "advogado":
            JOptionPane.showMessageDialog(null, "Tibúrcio é "+profissao);
            break;
            default :
            JOptionPane.showMessageDialog(null, "Tibúrcio é desempregado.");
            break;
        }
    }
}
