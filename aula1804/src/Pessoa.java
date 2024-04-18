 public class Pessoa {
    public String nome;
    public int idade;
    public String endereco;

    Pessoa (String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String listaPessoas() {
        return "Nome: " + this.nome + ", Idade: " + this.idade + ", Endereço: " + this.endereco;
    }

 }
