public class Solucao1g {
    public static void main(String[] args) {
        String nome = "Maria";
        char sexo = 'F';
        int idade = 24;

        if ((sexo == 'f' || sexo == 'F') && idade < 25) {
            System.out.println(nome + " ACEITA");
        } else {
            System.out.println(nome + " NÃO ACEITA");
        }
    }
}
     