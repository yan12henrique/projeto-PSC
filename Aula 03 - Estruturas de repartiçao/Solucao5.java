public class Solucao5 {
    public static void main(String[] args) {
        String nome;
        String[] nomes = {"Carlos", "Ana", "FIM"}; // Exemplo de entrada
        
        for (String n : nomes) {
            if (n.equals("FIM")) break;
            System.out.println(n);
        }
    }
}
