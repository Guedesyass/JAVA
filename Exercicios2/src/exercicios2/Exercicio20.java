package exercicios2;

import javax.swing.JOptionPane;

public class Exercicio20 {
    public static void main(String[] args) {
        int i, flag = 0;
        
        int numPessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas a ser cadastrado: "));
        
        String vetorPesquisado[]= new String[numPessoas];
        
        for(i=0;i < numPessoas; i++){
            vetorPesquisado[i] = JOptionPane.showInputDialog("Digite o nome para cadastro: ");
        }
        
        String elementoPesquisado = JOptionPane.showInputDialog("Digite o nome a ser procurado: ");
        
        for(i=0; i < numPessoas; i++){
            if(vetorPesquisado[i].equalsIgnoreCase(elementoPesquisado)){
                JOptionPane.showMessageDialog(null, "O nome foi encontrado na posição: "+i);
                flag = 1;
            }
        }
        if(flag == 0){
            JOptionPane.showMessageDialog(null, "O nome não foi encontrado");
        }
    }
}
