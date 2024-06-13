import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        iValia_tela a = new iValia_tela();

        a.setContentPane(a.painelPrincipal);

        a.setTitle("iValia Crud");

        a.setSize(400, 300);

        a.setVisible(true);

        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}



