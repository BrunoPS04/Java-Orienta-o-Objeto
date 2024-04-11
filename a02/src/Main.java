import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        String nome , nomeUsuario;
//
//        nome = JOptionPane.showInputDialog("Nome: ");
//        nomeUsuario = JOptionPane.showInputDialog("nomeUsuario:");
//
//        if (nome.equals(nomeUsuario)){
//
//            System.out.println("Iguais");
//
//        }else {
//
//            System.out.println("Diferentes");
//
//        }

        int numero, maior = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 5 numeros: \n");

        for (int i = 0; i < 5; i++) {

            numero = scanner.nextInt();

            if (numero > maior) {

                maior = numero;

            }
        }

        System.out.println("Maior número: " + maior);


    }

}