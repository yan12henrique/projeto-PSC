public class Solucao1u {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        System.out.println(maior);
    }
}