// Solucao1f.java
public class Solucao1f {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 2, 6}; // Números para identificação
        int maior = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("Maior: " + maior + ", Menor: " + menor);
    }
}