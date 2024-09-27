public class Solucao19 {
    public static void main(String[] args) {
        int numero = 5; // Exemplo de número
        long fatorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + numero + ": " + fatorial);
    }
}
