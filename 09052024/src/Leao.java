public class Leao extends Animal {

    private boolean temJuba; // Característica específica do leão

    public Leao(String nome, int idade, String habitat, boolean temJuba) {

        super(nome, idade, habitat);
        this.temJuba = temJuba;

    }

    public boolean temJuba() {

        return temJuba;

    }

    @Override
    public void emitirSom() {

        // Sobrescreve o método da superclasse.
        System.out.println("O leão ruge");

    }

}