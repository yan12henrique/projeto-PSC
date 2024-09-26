public class Solucao1k {
    public static void main(String[] args) {
        int n = 21;
        if (n % 3 == 0 && n % 7 == 0) {
            System.out.println("é divisível por 3 e por 7");
        } else {
            System.out.println("não é divisível por 3 e por 7");
        }
    }
}