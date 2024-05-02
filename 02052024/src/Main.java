import javax.swing.*;

public class Main {

    public static void main(String[] args) {

//      - Escolha livremente o tema de seu CRUD e crie uma classe para os objetos cadastrados;
//      - A classe criada deve ter pelo menos 3 atributos;
//      - Utilize um ArrayList para armazenar os objetos cadastrados;
//      - Crie a função de Cadastrar, para inserir um novo registro baseado nos dados informados pelo usuário;
//      - Crie a função de Localizar, para pesquisar um registro com base no nome informado pelo usuário. O resultado da busca deve ser mostrado nos inputs;
//      - Crie a função de Editar, para salvar no objeto as alterações que o usuário realizou nos dados dos inputs;
//      - Crie a função de Apagar, para deletar do ArrayList um objeto pesquisado;
//      - Crie a função de Mostrar todos os registros cadastrados, pode usar um textArea para mostrar que fica bem legal;
//      - Crie uma função para gerar alguns registros fakes (para poder testar sem ter que cadastrar cada vez que rodar)

        Crud c = new Crud();

        c.setContentPane(c.telaCrud);

        c.setTitle("Primeiro Crud");

        c.setSize(400, 300);

        c.setVisible(true);

        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}