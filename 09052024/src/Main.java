public class Main {

    public static void main(String[] args) {

        Leao leao = new Leao("Simba", 5, "Savana", true);
        System.out.println("Nome do Leão: " + leao.getNome());
        System.out.println("Idade do Leão: " + leao.getIdade());
        System.out.println("Habitat do Leão: " + leao.getHabitat());
        System.out.println("O leão tem juba? " + (leao.temJuba() ? "Sim" : "Não"));
        System.out.print("Som do Leão: "); leao.emitirSom();

        System.out.println("-------------------------");

        Elefante elefante = new Elefante("Dumbo", 10, "Floresta", 2);
        System.out.println("Nome do Elefante: " + elefante.getNome());
        System.out.println("Idade do Elefante: " + elefante.getIdade());
        System.out.println("Habitat do Elefante: " + elefante.getHabitat());
        System.out.println("Tamanho da Tromba do Elefante: " + elefante.getTamanhoDaTromba() + " Metros");
        System.out.print("Som do Elefante: "); elefante.emitirSom();
    }

}

