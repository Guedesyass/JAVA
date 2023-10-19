package exercicios2;

import javax.swing.JOptionPane;


public class Q2 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int num;
        int index;
        int colisoes = 0;
        
          
        for (int i = 0; i < 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            index = num % 10;


            if (numeros[index] != 0) {
                colisoes++;
            }

            if (num != 0) {
                numeros[index] = num;
            }
        }
        
        for(int i = 0; i < 10; i++){
            if(numeros[i] != 0){
                System.out.print("A posicao: " +i+ " contem o numero: " + numeros[i]+ "\n");
            }
            else{
                System.out.print("A posicao: " +i+ " esta vazia."+ "\n");
            }
        }
        
        System.out.print("O numero de colisoes foi: "+colisoes + "\n");
    }
}
