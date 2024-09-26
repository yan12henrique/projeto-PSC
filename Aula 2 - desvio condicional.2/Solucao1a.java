// Solucao1a.java
public class Solucao1a {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5; // Lados do triângulo
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os números podem ser lados de um triângulo.");
        } else {
            System.out.println("Os números não podem ser lados de um triângulo.");
        }
    }
}
