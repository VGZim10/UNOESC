public class Tecnico extends Funcionario {
    private String funcao;
    private double horaextra;

    public Tecnico(String nome, double salario, String funcao, double horaextra) {
        super(nome, salario); // Passa o comum para a superclasse
        this.funcao = funcao;
        this.horaextra = horaextra;
    }

    @Override
    public double calcularSalario() {
        // Regra: salário base + hora extra
        //return this.salario + this.horaextra;
        System.out.println("piazinho");   
    }

    // Getters e Setters específicos
    public String getFuncao() { return funcao; }
    public void setFuncao(String funcao) { this.funcao = funcao; }
    public double getHoraextra() { return horaextra; }
    public void setHoraextra(double horaextra) { this.horaextra = horaextra; }
}
