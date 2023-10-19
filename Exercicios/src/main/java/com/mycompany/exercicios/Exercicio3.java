package com.mycompany.exercicios;

import javax.swing.JOptionPane;


public class Exercicio3 {
     public static void main(String[] args) {
         String nomeCliente,categoria;
         double preco, desconto, precoTotal;
         
         nomeCliente = JOptionPane.showInputDialog("Digite seu nome: ");
         preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: "));
         categoria = JOptionPane.showInputDialog("Digite a categoria: ");
         
         switch(categoria.toLowerCase()){
            case "a":
                 desconto = (preco/100)*10;
                 precoTotal = preco - desconto;
                 JOptionPane.showMessageDialog(null, "O valor da compra de "+nomeCliente+" é: "+precoTotal);
            break;
            case "b":
                 desconto = (preco/100)*15;
                 precoTotal = preco - desconto;
                 JOptionPane.showMessageDialog(null, "O valor da compra de "+nomeCliente+" é: "+precoTotal);
            break;
            case "c":
                 desconto = (preco/100)*20;
                 precoTotal = preco - desconto;
                 JOptionPane.showMessageDialog(null, "O valor da compra de "+nomeCliente+" é: "+precoTotal);
            break;
            case "d":
                 desconto = (preco/100)*25;
                 precoTotal = preco - desconto;
                 JOptionPane.showMessageDialog(null, "O valor da compra de "+nomeCliente+" é: "+precoTotal);
            break;
            case "e":
                 desconto = (preco/100)*50;
                 precoTotal = preco - desconto;
                 JOptionPane.showMessageDialog(null, "O valor da compra de "+nomeCliente+" é: "+precoTotal);
            break;
         }
     }
}
