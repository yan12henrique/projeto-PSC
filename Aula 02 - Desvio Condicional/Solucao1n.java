public class Solucao1n {
    public static void main(String[] args) {
        int n = 2024;
        int milhar = (n / 1000) % 10;
        int centena = (n / 100) % 10;
        int numero = milhar * 10 + centena;
        if (numero % 4 == 0) {
            System.out.println("é múltiplo de 4");
        } else {
            System.out.println("não é múltiplo de 4");
        }
    }
}