public class Solucao15 {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int[] numeros = {10, 20, 30, -9999}; // Exemplo de entrada
        
        for (int numero : numeros) {
            if (numero == -9999) break;
            if (numero > maior) maior = numero;
        }
        System.out.println("Maior número: " + maior);
    }
}
