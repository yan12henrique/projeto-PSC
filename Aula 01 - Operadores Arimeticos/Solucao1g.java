class Solucao1g {
    public static void main(String[] args) {
        double angulo = 45; // Exemplo de ângulo em graus
        double radianos = Math.toRadians(angulo);

        System.out.println("Seno: " + Math.sin(radianos));
        System.out.println("Cosseno: " + Math.cos(radianos));
        System.out.println("Tangente: " + Math.tan(radianos));
        System.out.println("Secante: " + (1 / Math.cos(radianos)));
        System.out.println("Cossecante: " + (1 / Math.sin(radianos)));
        System.out.println("Cotangente: " + (1 / Math.tan(radianos)));
    }
}
