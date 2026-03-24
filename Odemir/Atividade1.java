public class Televisao {
    // Atributos encapsulados (privados) [cite: 13, 14, 26]
    private int volume;
    private int canal;

    public Televisao() {
        this.volume = 10;
        this.canal = 1;
    }

    // Métodos Getters e Setters para acesso seguro 
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        // Exemplo de proteção de dados: impede volumes inválidos 
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 0) {
            this.canal = canal;
        }
    }
}

publicclass ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    // Manipulação de dados usando os métodos da classe Televisao [cite: 15]
    public void aumentarVolume() {
        tv.setVolume(tv.getVolume() + 1);
    }

    public void diminuirVolume() {
        tv.setVolume(tv.getVolume() - 1);
    }

    public void aumentarCanal() {
        tv.setCanal(tv.getCanal() + 1);
    }

    public void diminuirCanal() {
        tv.setCanal(tv.getCanal() - 1);
    }

    public void trocarCanal(int novoCanal) {
        tv.setCanal(novoCanal);
    }

    public void consultarValores() {
        System.out.println("Status da TV:");
        // Acesso via getter [cite: 40]
        System.out.println("Canal atual: " + tv.getCanal());
        System.out.println("Volume atual: " + tv.getVolume());
        System.out.println("-------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando o objeto
        Televisao minhaTv = new Televisao();
        ControleRemoto controle = new ControleRemoto(minhaTv);

        // Manipulando dados através do controle (Métodos Públicos) [cite: 15, 69]
        controle.consultarValores();
        
        controle.aumentarVolume();
        controle.aumentarVolume();
        
        controle.trocarCanal(15); // Troca para canal específico [cite: 81]
        controle.aumentarCanal(); // Incrementa canal [cite: 81]

        controle.consultarValores(); // Consulta valores atuais [cite: 82]
    }
}