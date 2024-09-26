public class Solucao12 {
    public static void main(String[] args) {
        int contadorMenos21 = 0, contadorMais50 = 0;
        int[] idades = {18, 25, 55, 120, -1}; // Exemplo de idades
        
        for (int idade : idades) {
            if (idade < 0 || idade > 120) break;
            if (idade < 21) contadorMenos21++;
            if (idade > 50) contadorMais50++;
        }
        System.out.println("Menos de 21 anos: " + contadorMenos21);
        System.out.println("Mais de 50 anos: " + contadorMais50);
    }
}
