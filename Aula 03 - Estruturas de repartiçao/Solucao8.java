public class Solucao8 {
    public static void main(String[] args) {
        long produto = 1;
        for (int i = 120; i <= 300; i++) {
            produto *= i;
        }
        System.out.println("Produto: " + produto);
    }
}
