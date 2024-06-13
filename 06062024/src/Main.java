
public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro(1, "Dom Casmurro");
        Milkshake milkshake = new Milkshake(2, "Grande", "Chocolate");

        livro.concluir();
        milkshake.concluir();

        System.out.println("Livro: " + livro.getNome());
        System.out.println("Milkshake: Tamanho " + milkshake.getTamanho() + ", Sabor " + milkshake.getSabor());

    }

}

