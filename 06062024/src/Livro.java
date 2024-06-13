class Livro extends Pedido {

    private String nome;

    public Livro(int numero, String nome) {

        super(numero);
        this.nome = nome;

    }

    public String getNome() {

        return nome;

    }

}