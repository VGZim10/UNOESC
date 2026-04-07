import java.util.Scanner;
public interface FormaGeometrica {
    double calcularArea();

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual forma deseja criar?");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retangulo");
        System.out.println("3 - Circulo");
        System.out.print("Opcao: ");
        int opcao = sc.nextInt();

        FormaGeometrica forma;

        switch (opcao) {
            case 1 -> {
                System.out.print("Digite o tamanho do lado: ");
                double lado = sc.nextDouble();
                forma = new Quadrado(lado);
            }
            case 2 -> {
                System.out.print("Digite a base: ");
                double base = sc.nextDouble();
                System.out.print("Digite a altura: ");
                double altura = sc.nextDouble();
                forma = new Retangulo(base, altura);
            }
            case 3 -> {
                System.out.print("Digite o raio: ");
                double raio = sc.nextDouble();
                forma = new Circulo(raio);
            }
            default -> {
                System.out.println("Opcao invalida!");
                sc.close();
                return;
            }
        }

        System.out.printf("Area calculada: %.2f%n", forma.calcularArea());
        sc.close();
    }
}