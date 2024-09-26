public class Solucao6 {
    public static void main(String[] args) {
        int[] numeros = {9, 16, -999}; // Exemplo de entrada
        
        for (int numero : numeros) {
            if (numero == -999) break;
            System.out.println("Raiz quadrada: " + Math.sqrt(numero));
            System.out.println("Inverso: " + (1.0 / numero));
        }
    }
}
