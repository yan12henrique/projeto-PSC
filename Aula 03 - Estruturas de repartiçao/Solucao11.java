public class Solucao11 {
    public static void main(String[] args) {
        int[] codigos = {1, 2, 3, 0}; // Exemplo de códigos
        double[] consumos = {100, 200, 300}; // Exemplo de consumos
        int[] tipos = {1, 2, 3}; // Exemplo de tipos
        
        double totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;
        int contador1 = 0, contador2 = 0;

        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == 0) break;
            double custo = 0;
            if (tipos[i] == 1) {
                custo = consumos[i] * 0.3;
                totalResidencial += consumos[i];
                contador1++;
            } else if (tipos[i] == 2) {
                custo = consumos[i] * 0.5;
                totalComercial += consumos[i];
                contador2++;
            } else if (tipos[i] == 3) {
                totalIndustrial += consumos[i];
            }
            System.out.println("Custo do consumidor " + codigos[i] + ": R$ " + custo);
        }
        double media = (totalResidencial + totalComercial) / (contador1 + contador2);
        System.out.println("Total Residencial: " + totalResidencial);
        System.out.println("Total Comercial: " + totalComercial);
        System.out.println("Total Industrial: " + totalIndustrial);
        System.out.println("Média de consumo dos tipos 1 e 2: " + media);
    }
}
