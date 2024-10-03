class Solucao1l {
    public static void main(String[] args) {
        String data = "25/10/24"; // Exemplo
        String[] partes = data.split("/");

        System.out.println("Dia: " + partes[0] + ", Mês: " + partes[1] + ", Ano: " + partes[2]);
    }
}
