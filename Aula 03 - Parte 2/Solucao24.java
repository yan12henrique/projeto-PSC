public class Solucao24 {
    public static void main(String[] args) {
        double total = 0;
        // Simulação de entrada de dados
        double[] precos = {10, 20, -5, 30, 0}; // Exemplo de preços
        int[] quantidades = {2, 1, 0}; // Exemplo de quantidades
        
        for (int i = 0; i < precos.length; i++) {
            if (quantidades[i] == 0) break;
            if (precos[i] < 0) {
                System.out.println("Preço inválido. Digite novamente.");
                continue;
            }
            total += precos[i] * quantidades[i];
        }
        System.out.println("Total a ser pago: R$ " + total);
    }
}
