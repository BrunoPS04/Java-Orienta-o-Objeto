import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Crud extends JFrame {

    public JPanel telaCrud;
    private JTextField txtNome;
    private JTextField txtIdade;
    private JTextField txtEmail;
    private JTextArea textArea1;
    private JButton cadastrarButton;
    private JButton localizarButton;
    private JButton editarButton;
    private JButton apagarButton;
    private JButton mostrarButton;

    public ArrayList<Usuario> usuarios;

    public Crud() {

        usuarios = new ArrayList<Usuario>();

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String email = txtEmail.getText();
                int idade = Integer.parseInt(txtIdade.getText());
                usuarios.add(new Usuario(nome, email, idade));
                txtNome.setText("");
                txtEmail.setText("");
                txtIdade.setText("");
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            }
        });

        localizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                for (Usuario usuario : usuarios) {
                    if (usuario.getNome().equals(nome)) {
                        txtNome.setText(usuario.getNome());
                        txtEmail.setText(usuario.getEmail());
                        txtIdade.setText(String.valueOf(usuario.getIdade()));
                        JOptionPane.showMessageDialog(null, "Usuário localizado com sucesso!");
                        break;
                    }else {
                        JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                    }
                }
            }
        });

        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                for (Usuario usuario : usuarios) {
                    if (usuario.getNome().equals(nome)) {
                        usuario.setEmail(txtEmail.getText());
                        usuario.setIdade(Integer.parseInt(txtIdade.getText()));
                        JOptionPane.showMessageDialog(null, "O usuário foi editado com sucesso!");
                        break;
                    }
                }
            }
        });

        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                usuarios.removeIf(usuario -> usuario.getNome().equals(nome));
                JOptionPane.showMessageDialog(null, "O usuário foi apagado!");
            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                for (Usuario usuario : usuarios) {
                    textArea1.append("Nome: " + usuario.getNome() + ", " + "Idade: " + usuario.getIdade() + ", " + "E-mail: " + usuario.getEmail() + "\n");
                }
            }
        });
    }

}