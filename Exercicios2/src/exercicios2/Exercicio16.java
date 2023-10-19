package exercicios2;


public class Exercicio16 {
        public static void main(String[] args) {
            int numbers [] = new int[25];
            int pairNumbers [] = new int[25];
            int n1 = 33;
            
            /*adicionando os números a array principal por meio de um loop que adiciona do número 33 ao 57*/
            for( int i = 0; i < 25; i++ ){
                numbers[i] = n1;
                n1++;
            }
            
            /*usando a operação matemática de resto para pegar os números pares e adiciona-los na array de números pares e mostra-los*/
            for (int i = 0; i < 25; i++){
                if(numbers[i]%2 == 0){
                    pairNumbers[i] = numbers[i];
                    System.out.print(pairNumbers[i]+" " );
                }
            }
            
        }
}