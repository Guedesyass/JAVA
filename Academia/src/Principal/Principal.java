package Principal;

import Models.Aluno;
import Models.Funcionario;
import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        Aluno novoAluno = new Aluno(1, "Carlos", 25, 75.5, 1.81);
        
        JOptionPane.showMessageDialog(null,
        "Nome: " + novoAluno.getName()+ "\n"
         + "Idade: "+ novoAluno.getAge()+ "\n"
         + "Altura: "+ novoAluno.getHeight() + "\n"
         + "Peso: " + novoAluno.getWeight()+ "\n"
        );
        
        Funcionario novo_funcionario = new Funcionario();
        novo_funcionario.setName("Mauricio");
        novo_funcionario.setSalary(2000.50);
        novo_funcionario.setAge(36);
        
        JOptionPane.showMessageDialog(null,
            "Nome: "+ novo_funcionario.getName()+ "\n" +
            "Idade: " + novo_funcionario.getAge()+ "\n" + 
            "Salário: "+ novo_funcionario.getSalary()
        );
    }
    
}
