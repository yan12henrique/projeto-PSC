public class Solucao21 {
    public static void main(String[] args) {
        // Simulação de entrada de dados
        String[] nomes = {"Carlos", "Ana", "João", "Pedro"};
        int[] idades = {22, 18, 23, 30};
        char[] sexos = {'M', 'F', 'M', 'M'}; // M = masculino, F = feminino
        
        for (int i = 0; i < nomes.length; i++) {
            if (sexos[i] == 'M' && idades[i] > 21) {
                System.out.println(nomes[i]);
            }
        }
    }
}
