class Imovel {

    private String endereco;
    private double area;
    private int numeroQuartos;
    private int id;
    private String tipo;
    private String padrao;

    public Imovel(String endereco, double area, int numeroQuartos, int id, String tipo, String padrao) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.id = id;
        this.tipo = tipo;
        this.padrao = padrao;
    }

    public void reformar() {
        // Lógica para reformar o imóvel
        System.out.println("Imóvel reformado!");
    }
}