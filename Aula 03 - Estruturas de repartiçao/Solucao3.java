public class Solucao3 {
    public static void main(String[] args) {
        double soma = 0;
        int contador = 0;
        int numero;
        int[] numeros = {10, 20, 30, 0}; // Exemplo de entrada
        
        for (int i = 0; i < numeros.length; i++) {
            numero = numeros[i];
            if (numero <= 0) break;
            soma += numero;
            contador++;
        }
        System.out.println("Média: " + (soma / contador));
    }
}
