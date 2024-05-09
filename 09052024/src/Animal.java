public class Animal {

    private String nome;
    private int idade;
    private String habitat;

    public Animal(String nome, int idade, String habitat) {

        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;

    }

    public String getNome() {

        return nome;

    }

    public int getIdade() {

        return idade;

    }

    public String getHabitat() {

        return habitat;

    }

    public void emitirSom() {

        // pode ser substituída pelas subclasses.
        System.out.println("O animal faz um som");

    }

}

