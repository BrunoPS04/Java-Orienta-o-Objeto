import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class Biblioteca  extends JFrame{
    public JPanel painelPrincipal;
    private JTextField textTitulo;
    private JTextField textAutor;
    private JTextField textGenero;
    private JTextField textAno;
    private JButton buttonCadastro;

    public ArrayList<Livro> livros;

    public Biblioteca() {

        livros = new ArrayList<Livro>();

        buttonCadastro.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String titulo = textTitulo.getText();
                String autor = textAutor.getText();
                String genero = textGenero.getText();
                int ano = Integer.parseInt(textAno.getText());
                livros.add(new Livro(titulo, autor, genero,ano));
                textTitulo.setText("");
                textAutor.setText("");
                textGenero.setText("");
                textAno.setText("");
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                gravarListaComoJson(livros);
            }

        });

    }

    public static void gravarListaComoJson(ArrayList<Livro> lista) {
        // Criar um objeto Gson para serialização
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("Livros.json")) {
            // Serializar a lista em formato JSON e gravar no arquivo
            gson.toJson(lista, writer);
            System.out.println("Lista de livros gravada como JSON com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

