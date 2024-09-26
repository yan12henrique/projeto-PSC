// Solucao1d.java
public class Solucao1d {
    public static void main(String[] args) {
        String nome = "Carlos"; // Nome do aluno
        char letra = nome.charAt(0);
        if (letra >= 'A' && letra <= 'K') {
            System.out.println("O aluno está na D1.");
        } else if (letra >= 'L' && letra <= 'N') {
            System.out.println("O aluno está na D2.");
        } else {
            System.out.println("O aluno está na D3.");
        }
    }
}