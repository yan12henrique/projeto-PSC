class Solucao1k {
    public static void main(String[] args) {
        int data = 251024; // Exemplo: 25/10/24
        int dia = data / 10000;
        int mes = (data / 100) % 100;
        int ano = data % 100;

        System.out.println("Dia: " + dia + ", Mês: " + mes + ", Ano: " + ano);
    }
}
