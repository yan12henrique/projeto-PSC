
// Solucao1c.java
public class Solucao1c {
    public static void main(String[] args) {
        String verbo = "andar"; // Verbo em infinitivo
        if (verbo.endsWith("ar")) {
            System.out.println("1a conjugação (terminado em 'ar')");
        } else if (verbo.endsWith("er")) {
            System.out.println("2a conjugação (terminado em 'er')");
        } else if (verbo.endsWith("ir")) {
            System.out.println("3a conjugação (terminado em 'ir')");
        } else if (verbo.endsWith("or") || verbo.endsWith("ur")) {
            System.out.println("Provavelmente não é verbo no infinitivo.");
        } else {
            System.out.println("Não está no infinitivo (não termina em 'r').");
        }
    }
}