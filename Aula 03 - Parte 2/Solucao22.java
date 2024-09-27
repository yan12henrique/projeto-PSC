public class Solucao22 {
    public static void main(String[] args) {
        int limite = 15; // Exemplo de limite
        
        for (int i = 1; i < limite; i++) {
            if (i % 2 != 0) {
                System.out.print(i + (i < limite - 1 ? ", " : ""));
            }
        }
        System.out.println();
    }
}
   