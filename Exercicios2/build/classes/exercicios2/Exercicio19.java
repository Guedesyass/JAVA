package exercicios2;

public class Exercicio19 {
   public static void main(String[] args) {
       int numbers [] = new int [10];
       int i = 0;
       int n = 13;
       
       do{
           numbers[i] = n++;
           if(numbers[i]%2 == 0){
               System.out.print(numbers[i]  + "\n");
           }
           i++; 
       }while( i < 10);
   } 
}
