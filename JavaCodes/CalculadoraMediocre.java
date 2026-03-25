public class CalculadoraMediocre {
    public static void main(String[] args){
    int x = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);

    switch(args[0]){
        case "somar":
            sum(x , y);
            break;
        case "diminuir":
            minus(x , y);
            break;
        case "dividir":
            dividir(x , y);
            break;
        case "multiplicar":
            multiplicar(x , y);
            break;
        }
    }

    static void sum(int x, int y) {
        System.out.println( x + y );
    }

    static void minus(int x, int y) {
        System.out.println( x - y );
    }

    static void dividir(int x, int y) {
        System.out.println(x / y);
    }

    static void multiplicar(int x, int y) {
        System.out.println(x * y);
    }
}