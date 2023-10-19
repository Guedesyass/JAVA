package Models;

public class Professor extends Pessoa{
    private double salario;
    private String titulo;

    public Professor() {

    }

    public Professor(double salario, String titulo) {
        this.salario = salario;
        this.titulo = titulo;
    }

    public Professor(double salario, String titulo, int id, String name, int age) {
        super(id, name, age);
        this.salario = salario;
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
   public double calcularImposto(double porcentagem) {
        return this.salario * porcentagem;
    }
    
    @Override
    public void MostrarDados(){
        super.MostrarDados();
        System.out.print("Titulo:" + this.titulo + "\n" );
        System.out.print("Salario:" + this.salario + "\n" );
    }
}
