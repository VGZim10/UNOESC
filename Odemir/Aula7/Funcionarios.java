public class Funcionario {
    protected String nome;
    protected double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método que será sobrescrito pelas subclasses
    public double calcularSalario() {
        return this.salario;
    }

    // Getters e Setters (Opcionais, mas boas práticas)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}

