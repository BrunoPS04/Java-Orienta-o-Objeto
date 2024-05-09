public class Elefante extends Animal {

    private int tamanhoDaTromba; // Característica específica do elefante

    public Elefante(String nome, int idade, String habitat, int tamanhoDaTromba) {

        super(nome, idade, habitat);
        this.tamanhoDaTromba = tamanhoDaTromba;

    }

    public int getTamanhoDaTromba() {

        return tamanhoDaTromba;

    }

    @Override
    public void emitirSom() {

        // Sobrescreve o método da superclasse.
        System.out.println("O elefante faz barulho de trombeta");

    }

}