import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Biblioteca b = new Biblioteca();

        b.setContentPane(b.painelPrincipal);

        b.setTitle("Primeiro Crud");

        b.setSize(400, 300);

        b.setVisible(true);

        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}



