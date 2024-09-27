public class Solucao20 {
    public static void main(String[] args) {
        int limite = 20; // Exemplo de limite
        int incremento = 5; // Exemplo de incremento
        
        for (int i = 0; i <= limite; i += incremento) {
            System.out.print(i + (i < limite ? ", " : ""));
        }
        System.out.println();
    }
}
