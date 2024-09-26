public class Solucao4 {
    public static void main(String[] args) {
        int contador = 0;
        int numero;
        int[] numeros = {150, 120, 85, 0}; // Exemplo de entrada
        
        for (int i = 0; i < numeros.length; i++) {
            numero = numeros[i];
            if (numero == 0) break;
            if (numero >= 100 && numero <= 200) contador++;
        }
        System.out.println("Números entre 100 e 200: " + contador);
    }
}
