package exercicios2;


public class Exercicio17 {
    public static void main(String[] args) {
        double sum = 0.0;
        double average;
        int i = 0;
        
        while(i <= 999){
        sum += sum + 1;
        i++;
    } 
        average = sum/1000;
    System.out.print(average + "\n" );
    }
}
