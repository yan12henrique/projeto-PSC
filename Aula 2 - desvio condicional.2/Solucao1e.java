// Solucao1e.java
public class Solucao1e {
    public static void main(String[] args) {
        int a = 5, b = 2, c = 3; // Números para armazenar
        int maior, menor, intermediario;

        if (a > b && a > c) {
            maior = a;
            if (b > c) {
                intermediario = b;
                menor = c;
            } else {
                intermediario = c;
                menor = b;
            }
        } else if (b > a && b > c) {
            maior = b;
            if (a > c) {
                intermediario = a;
                menor = c;
            } else {
                intermediario = c;
                menor = a;
            }
        } else {
            maior = c;
            if (a > b) {
                intermediario = a;
                menor = b;
            } else {
                intermediario = b;
                menor = a;
            }
        }
        System.out.println("Maior: " + maior + ", Intermediário: " + intermediario + ", Menor: " + menor);
    }
}
