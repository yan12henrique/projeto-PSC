public class Solucao17 {
    public static void main(String[] args) {
        System.out.println("Tabela de conversão de polegadas para centímetros:");
        System.out.println("Polegadas\tCentímetros");
        for (int i = 1; i <= 20; i++) {
            double cm = i * 2.54;
            System.out.printf("%d\t\t%.2f%n", i, cm);
        }
    }
}
