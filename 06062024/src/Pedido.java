class Pedido {

    private int numero;
    private boolean status;

    public Pedido(int numero) {

        this.numero = numero;
        this.status = false; // Inicialmente não concluído

    }

    public void concluir() {

        this.status = true;
        System.out.println("Pedido #" + numero + " concluído!");

    }

}
