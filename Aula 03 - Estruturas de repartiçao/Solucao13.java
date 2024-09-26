public class Solucao13 {
    public static void main(String[] args) {
        int numero = 29; // Exemplo de número
        boolean primo = true;

        if (numero < 2) primo = false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        System.out.println("Número " + numero + (primo ? " é primo." : " não é primo."));
    }
}
