import javax.swing.*;
import java.util.ArrayList;

  public class Main {

    public static void main(String[] args){

       ArrayList<Pessoa> pessoas = new ArrayList<>();

        int i;

        for (i = 0; i < 3; i++){

           String nomeLido = JOptionPane.showInputDialog("Digite seu nome " + (i+1));
           int idadeLido = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade " + (i+1)));
           String enderecoLido = JOptionPane.showInputDialog("Digite seu endereço " + (i+1));

            pessoas.add(new Pessoa(nomeLido, idadeLido, enderecoLido));

       }

       for (Pessoa galera : pessoas) {

           System.out.println(galera.listaPessoas());

       }

    }

  }