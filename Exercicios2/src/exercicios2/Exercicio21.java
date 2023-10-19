package exercicios2;

import javax.swing.JOptionPane;

public class Exercicio21 {
    public static void main(String[] args) {
        int matriz[][] = new int [3][3];
        int i, j;
        
        for(i = 0; i < 3; i ++){
            for(j = 0; j < 3; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da célula: "));
                System.out.print(matriz[i][j]+"\n");
            }
        }
        
        /*a)Calcule e mostre a soma dos elementos da primeira coluna;*/
        int sum=0;
        for(i =0; i < 3; i++){
            sum = sum + matriz[i][0];
        }
        System.out.print("soma dos valores da primeira coluna = "+sum+"\n.");
        
        /*b)Calcule e mostre a soma dos elementos de cada coluna;*/
        int sum1=0;
        for(i =0; i < 3; i++){
            for(j =0; j < 3; j++){
                sum1 = sum1 + matriz[j][i];
            }
        }
        System.out.print("soma dos valores de cada coluna = "+sum1+"\n.");
        
        
        /*c)Calcule e mostre o produto dos elementos da primeira linha;*/
        int produto = 1;
        for(i = 0; i < 3; i++){
            produto = produto*matriz[0][i];
        }
        
        System.out.print("produto dos elementos da primeira linha = "+produto+"\n.");
        
        
        /*d)Calcule e mostre a soma de todos os elementos da matriz;*/
        int sum2= 0;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j ++){
                sum2 = sum2 + matriz[i][j];
            }
        }
        
        System.out.print("Soma de todos os elementos da matriz = "+sum2 +"\n.");
        
        /*d)Calcule e mostre a soma de todos os elementos da matriz;*/
        int average = sum2/9;
        System.out.print("media de todos os elementos da matriz = "+ average +"\n.");
        
        
        
        /*f)Calcule e mostre os elementos que são maiores que a média;*/
        int biggerThanAverage[] = new int[9];
        System.out.print("elementos que sao maiores que a media = \n.");
         for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j ++){
                if (matriz[i][j] > average){
                    biggerThanAverage[i] = matriz[i][j];
                    System.out.print(biggerThanAverage[i]);
                }
            }  
        }
         
         
       /*g)Calcule e mostre o maior elemento da matriz e sua posição;*/
       int bigger = 0 ;
       int x = 0;
       int y = 0 ;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j ++){
                if (matriz[i][j] > bigger){
                    bigger = matriz[i][j];
                    x = i;
                    y = j;
                }
            }  
        }
        System.out.print("\nmaior elemento=" + bigger + " ,esta na linha: " + x + " e na coluna: " +y+"\n.");
        
        
       /*h)Calcule e mostre o menor elemento da matriz e sua posição*/
       int smaller = 0 ;
       int a = 0;
       int b = 0 ;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j ++){
                if (matriz[i][j] < smaller){
                    smaller = matriz[i][j];
                    a = i;
                    b = j;
                }
            }  
        }
        System.out.print("maior elemento =" + smaller + " ,esta na linha: " + a + " e na coluna: " +b+"\n.");
        
    }
}
