public class Solucao1l {
    public static void main(String[] args) {
        int n = 26;
        if (n % 10 == 0) {
            System.out.println("é divisível por 10");
        } else if (n % 5 == 0) {
            System.out.println("é divisível por 5");
        } else if (n % 2 == 0) {
            System.out.println("é divisível por 2");
        } else {
            System.out.println("não é divisível por nenhum destes");
        }
    }
}
