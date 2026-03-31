public class Docente extends Funcionario {
    private String titulacao;
    private int nivel;

    public Docente(String nome, double salario, String titulacao, int nivel) {
        super(nome, salario);
        this.titulacao = titulacao;
        this.nivel = nivel;
    }

    @Override
    public double calcularSalario() {
        // Regra: salário base + adicional por nível
        // Exemplo: cada nível aumenta R$ 500,00 no salário base
        double adicional = this.nivel * 500.0; 
        return this.salario + adicional;
    }

    // Getters e Setters específicos
    public String getTitulacao() { return titulacao; }
    public void setTitulacao(String titulacao) { this.titulacao = titulacao; }
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
}