package Models;

public class Funcionario extends Pessoa{
    private String turno;
    private String cargo;
    private double salario;
    private double horas_extras;

    public Funcionario() {
    }

    public Funcionario(String turno, String cargo, double salario, double horas_extras) {
        this.turno = turno;
        this.cargo = cargo;
        this.salario = salario;
        this.horas_extras = horas_extras;
    }

    public Funcionario(String turno, String cargo, double salario, double horas_extras, int id, String name, int age) {
        super(id, name, age);
        this.turno = turno;
        this.cargo = cargo;
        this.salario = salario;
        this.horas_extras = horas_extras;
    }

    public double getHoras_extras() {
        return horas_extras;
    }

    public void setHoras_extras(double horas_extras) {
        this.horas_extras = horas_extras;
    }

    public String getTurno() {
        return turno;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
//    overloading
    public double calcularImposto() {
        return this.salario * 0.11;
    }
           
    public double calcularImposto(double porcentagem) {
        return this.salario * porcentagem;
    }
    
    public double horaExtra (int horas){
        return ( horas * this.getHoras_extras());
    }
    
    @Override
    public void MostrarDados(){
        super.MostrarDados();
        System.out.print("Cargo:" + this.cargo + "\n" );
        System.out.print("Turno:" + this.turno + "\n" );
        System.out.print("Salario:" + this.salario + "\n" );
        System.out.print("Bonus:" + this.horas_extras + "\n" );
    }
}
