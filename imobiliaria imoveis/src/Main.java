public class Main {

    public static void main(String[] args) {

        ImovelDeAluguel imovelAluguel = new ImovelDeAluguel("Rua A, 123", 100.0, 3, 1, "Apartamento", "Padrão",
                1500.0, true);
        imovelAluguel.alugar();
        imovelAluguel.devolver();

        ImovelDeVenda imovelVenda = new ImovelDeVenda("Rua B, 456", 150.0, 4, 2, "Casa", "Luxo", 500000.0);
        System.out.println("Preço do imóvel à venda: R$" + imovelVenda.getPreco());
    }
}