public class Solucao1m {
    public static void main(String[] args) {
        int n = 123;
        int dezena = (n / 10) % 10;
        if (dezena % 2 == 0) {
            System.out.println("A casa das dezenas é par");
        } else {
            System.out.println("A casa das dezenas é ímpar");
        }
    }
}