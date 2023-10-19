package Models;


public class Aluno extends Pessoa{
    private String curso;
    private int fase;
    private boolean Formando;

    public Aluno() {
    }

    public Aluno(String curso, int fase, boolean Formando) {
        this.curso = curso;
        this.fase = fase;
        this.Formando = Formando;
    }

    public Aluno(String curso, int serie, int id, String name, int age) {
        super(id, name, age);
        this.curso = curso;
        this.fase = serie;
    }

    public String getCurso() {
        return curso;
    }

    public int getFase() {
        return fase;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
    
    public void VerificarFormando(int fase){
        if(fase != 10){
            this.Formando = false;
            System.out.print("Formando: falso\n ");
        }
        else{
            this.Formando = true;
            System.out.print("Formando: verdadeiro\n");
        }
    }

    @Override
    public void MostrarDados(){
        super.MostrarDados();
        System.out.print("Curso: "+ this.curso + "\n");
        System.out.print("Fase: "+ this.fase + "\n");
    }
    
//    public void Aprovado(double notaFinal){
//        if(notaFinal >= 7){
//            this.Aprovado = true;
//            System.out.print("Aluno aprovado!");
//        }
//        else{
//            this.Aprovado = false;
//            System.out.print("Aluno reprovado :(");
//        }
//    }
}
