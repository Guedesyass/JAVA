package Models;

public class Funcionario {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Funcionario() {
    }

    public Funcionario(int id, String name, int age, String pic) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
                
    }
    
}
