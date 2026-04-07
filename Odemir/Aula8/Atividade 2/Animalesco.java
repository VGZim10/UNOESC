interface Animal {
    String falar();
}

public class Animalesco {
    public static void main(String[] args) {
        Animal[] animais = new Animal[10];

        animais[0] = new Homem();
        animais[1] = new Cao();
        animais[2] = new Gato();
        animais[3] = new Homem();
        animais[4] = new Gato();
        animais[5] = new Cao();
        animais[6] = new Gato();
        animais[7] = new Homem();
        animais[8] = new Cao();
        animais[9] = new Gato();

        for (int i = 0; i < animais.length; i++) {
            System.out.println("Animal " + (i + 1) + " fala: " + animais[i].falar());
        }
    }
}