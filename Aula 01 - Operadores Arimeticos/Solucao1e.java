class Solucao1e {
    public static void main(String[] args) {
        double valorInicial = 100.0; // Dívida inicial
        double juros = 10.0; // Juros em %
        int meses = 8; // Número de meses

        double valorFinal = valorInicial * Math.pow((1 + juros / 100), meses);
        System.out.println("Valor a ser pago após 8 meses: R$ " + valorFinal);
    }
}
