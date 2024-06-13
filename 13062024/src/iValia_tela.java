import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class iValia_tela extends JFrame{
    public JPanel painelPrincipal;
    private JTextField txtComentario;
    private JTextField txtEstabelecimeto;
    private JTextField txtNota;
    private JTextField txtItem;
    private JTextArea txtResultado;
    private JButton guardarButton;
    private JButton buscarEstabelecimentoButton;
    private JButton buscarItemButton;
    private JButton mostrarTudoButton;

    List<Avaliacao> avaliacoes = new ArrayList<>();

    public iValia_tela() {

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comentario = txtComentario.getText();
                String estabelecimento = txtEstabelecimeto.getText();
                int nota = Integer.parseInt(txtNota.getText());
                String itens = txtItem.getText();

                avaliacoes.add(new Avaliacao(estabelecimento, itens, nota, comentario));

                txtComentario.setText("");
                txtEstabelecimeto.setText("");
                txtNota.setText("");
                txtItem.setText("");

            }
        });

        buscarEstabelecimentoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String estabelecimento = txtEstabelecimeto.getText();
                txtResultado.setText("");
                for (Avaliacao avaliacao : avaliacoes) {
                    txtEstabelecimeto.setText("");
                    if (avaliacao.getEstabelecimento().equals(estabelecimento)) {
                        txtResultado.append("=======================================================\n");
                        txtResultado.append("Estabelecimento: " + avaliacao.getEstabelecimento() + "\n");
                        txtResultado.append("Item: " + avaliacao.getItens() + "\n");
                        txtResultado.append("Nota: " + avaliacao.getNota() + "\n");
                        txtResultado.append("Comentário: " + avaliacao.getComentario() + "\n\n");
                    }
                }
            }
        });

        buscarItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = txtItem.getText();
                txtResultado.setText("");
                for (Avaliacao avaliacao : avaliacoes) {
                    txtItem.setText("");
                    if (avaliacao.getItens().contains(item)) {
                        txtResultado.append("=======================================================\n");
                        txtResultado.append("Estabelecimento: " + avaliacao.getEstabelecimento() + "\n");
                        txtResultado.append("Item: " + avaliacao.getItens() + "\n");
                        txtResultado.append("Nota: " + avaliacao.getNota() + "\n");
                        txtResultado.append("Comentário: " + avaliacao.getComentario() + "\n\n");
                    }
                }
            }
        });

        mostrarTudoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtResultado.setText("");

                for (Avaliacao avaliacao : avaliacoes) {
                    txtResultado.append("=======================================================\n");
                    txtResultado.append("Estabelecimento: " + avaliacao.getEstabelecimento() + "\n");
                    txtResultado.append("Item: " + avaliacao.getItens() + "\n");
                    txtResultado.append("Nota: " + avaliacao.getNota() + "\n");
                    txtResultado.append("Comentário: " + avaliacao.getComentario() + "\n\n");
                }
            }
        });

        txtEstabelecimeto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String estabelecimento = txtEstabelecimeto.getText();
                txtResultado.setText("");
                if (!estabelecimento.isEmpty()) {
                    for (Avaliacao avaliacao : avaliacoes) {
                        if (avaliacao.getEstabelecimento().toLowerCase().startsWith(estabelecimento.toLowerCase())) {
                            txtResultado.append("=======================================================\n");
                            txtResultado.append("Estabelecimento: " + avaliacao.getEstabelecimento() + "\n");
                            txtResultado.append("Item: " + avaliacao.getItens() + "\n");
                            txtResultado.append("Nota: " + avaliacao.getNota() + "\n");
                            txtResultado.append("Comentário: " + avaliacao.getComentario() + "\n\n");
                        }
                    }
                }
            }
        });

    }
}
