public class Solucao25 {
    public static void main(String[] args) {
        int[] votos = new int[4]; // Para 4 candidatos
        int totalEleitores = 0;
        // Simulação de entrada de dados
        int[] entradas = {1, 2, 3, 4, -1}; // Exemplo de votos
        
        for (int voto : entradas) {
            if (voto == -1) break;
            if (voto >= 1 && voto <= 4) {
                votos[voto - 1]++;
                totalEleitores++;
            }
        }
        
        System.out.println("Resultado da eleição:");
        for (int i = 0; i < votos.length; i++) {
            System.out.printf("Candidato %d: %.2f%% (%d votos)%n", i + 1, (votos[i] / (double) totalEleitores) * 100, votos[i]);
        }
        System.out.println("Total de eleitores: " + totalEleitores);
    }
}
