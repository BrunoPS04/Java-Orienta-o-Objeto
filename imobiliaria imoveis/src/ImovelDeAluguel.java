class ImovelDeAluguel extends Imovel {

    private double valorDoAluguel;
    private boolean disponibilidade;

    public ImovelDeAluguel(String endereco, double area, int numeroQuartos, int id, String tipo, String padrao, double valorDoAluguel, boolean disponibilidade) {
        super(endereco, area, numeroQuartos, id, tipo, padrao);
        this.valorDoAluguel = valorDoAluguel;
        this.disponibilidade = disponibilidade;
    }

    public void alugar() {
        // Lógica para alugar o imóvel
        System.out.println("Imóvel alugado!");
    }

    public void devolver() {
        // Lógica para devolver o imóvel
        System.out.println("Imóvel devolvido!");
    }
}



