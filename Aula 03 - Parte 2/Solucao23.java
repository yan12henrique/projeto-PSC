public class Solucao23 {
    public static void main(String[] args) {
        int quantos = 4; // Exemplo: quantos pares imprimir
        for (int i = 1; i <= quantos; i++) {
            System.out.print(i * 2 + (i < quantos ? ", " : ""));
        }
        System.out.println();
    }
}
