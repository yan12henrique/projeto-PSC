public class Solucao14 {
    public static void main(String[] args) {
        int contadorPrimos = 0;
        int[] numeros = {2, 3, 4, -1}; // Exemplo de entrada
        
        for (int numero : numeros) {
            if (numero <= 0) break;
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) contadorPrimos++;
        }
        System.out.println("Quantidade de primos: " + contadorPrimos);
    }
}