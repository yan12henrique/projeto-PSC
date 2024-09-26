
public class Solucao1o {
    public static void main(String[] args) {
        int anoNascimento = 1990;
        int anoAtual = 2024;
        if (anoNascimento < 0 || anoNascimento > anoAtual) {
            System.out.println("Ano de nascimento inválido");
        } else {
            int idade = anoAtual - anoNascimento;
            System.out.println("Idade: " + idade);
        }
    }
}