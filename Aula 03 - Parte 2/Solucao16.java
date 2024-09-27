public class Solucao16 {
    public static void main(String[] args) {
        int limite = 10; // Exemplo de limite
        int a = 0, b = 1;
        System.out.print("Fibonacci: " + a);
        
        while (b <= limite) {
            System.out.print(", " + b);
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
}
