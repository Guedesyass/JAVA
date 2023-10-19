package Principal;

import Models.Aluno;
import Models.Funcionario;
import Models.Professor;

public class Escola {

    public static void main(String[] args) {
        Aluno A1 = new Aluno();
        A1.setName("Mario");
        A1.setAge(17);
        A1.setCurso("ADS");
        A1.setFase(8);
        
        A1.VerificarFormando(A1.getFase());
        A1.MostrarDados();
        
        Professor P1 = new Professor(2500.00, "Especialista", 1 , "Carlos", 30);
        P1.MostrarDados();
        P1.calcularImposto(2.0);
        
        Funcionario F1 = new Funcionario();
        F1.setName("Laura");
        F1.setAge(25);
        F1.setCargo("Atendente");
        F1.setTurno("Matutino");
        F1.setHoras_extras(15.30);
        F1.setSalario(1450.00);
        F1.horaExtra(10);
        F1.MostrarDados();
        F1.calcularImposto();
    }
    
}
