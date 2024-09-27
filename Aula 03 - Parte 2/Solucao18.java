public class Solucao18 {
    public static void main(String[] args) {
        int limiteInferior = 0, limiteSuperior = 100, incremento = 5; // Exemplo
        
        System.out.println("Tabela de conversão de Celsius para Fahrenheit:");
        System.out.println("Celsius\tFahrenheit");
        
        for (int c = limiteInferior; c <= limiteSuperior; c += incremento) {
            double f = (c * 9 / 5) + 32;
            System.out.printf("%d\t%.2f%n", c, f);
        }
    }
}
