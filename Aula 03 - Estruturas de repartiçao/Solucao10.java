public class Solucao10 {
    public static void main(String[] args) {
        int[] numeros = {12, 15, 25, -999}; // Exemplo de entrada
        
        for (int numero : numeros) {
            if (numero == -999) break;
            System.out.print("Divisores de " + numero + ": ");
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
