class Solucao1j {
    public static void main(String[] args) {
        String frase1 = "Eu amo programar.";
        String frase2 = "Java é uma linguagem poderosa.";
        String frase3 = "Aprender é fundamental.";
        
        String metade1 = frase1.substring(0, frase1.length() / 2);
        String metade2 = frase2.substring(frase2.length() / 2);
        String metade3 = frase3.substring(frase3.length() / 2);
        
        String fraseEmbaralhada = metade2 + metade3 + metade2 + metade1 + metade3 + metade1;

        System.out.println("Frase original: " + frase1 + " " + frase2 + " " + frase3);
        System.out.println("Frase embaralhada: " + fraseEmbaralhada);
    }
}
