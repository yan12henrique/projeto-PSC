// Solucao1b.java
public class Solucao1b {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 5; // Lados do triângulo
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
    }
}