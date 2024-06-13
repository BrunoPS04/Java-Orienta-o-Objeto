class Milkshake extends Pedido {

    private String tamanho;
    private String sabor;

    public Milkshake(int numero, String tamanho, String sabor) {

        super(numero);
        this.tamanho = tamanho;
        this.sabor = sabor;

    }

    public String getTamanho() {

        return tamanho;

    }

    public String getSabor() {

        return sabor;

    }

}