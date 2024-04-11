import javax.swing.*;

public class Main {

//    Ler n salários e:
//
//    (a) encontrar o maior**
//
//    (b) aplicar 10% de aumento a quem ganha menos de R$2500,00**
//
//    (c) mostrar o total da folha de pagamento antiga**
//
//    (d) mostrar o total da folha corrigida**

    public static void main(String[] args) {

        int numeroDeSalarios = 5;
        int[] salarios = new int[numeroDeSalarios];
        int salarioMaior = 0;
        int totalFolhaAntiga = 0;
        int totalFolhaCorrigida = 0;

        for(int i = 0; i< numeroDeSalarios; i++){

            salarios[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1+"°") + " Salário: "));

            totalFolhaAntiga += salarios[i];

            if(salarios[i] > salarioMaior){
                salarioMaior = salarios[i];
            }

            if(salarios[i] < 2500){

                salarios[i] += salarios[i] * 0.1;
            }

            totalFolhaCorrigida += salarios[i];
        }

        System.out.println("Maior salário: " + salarioMaior);
        System.out.println("Total da folha de pagamento antiga: " + totalFolhaAntiga);
        System.out.println("Total da folha de pagamento corrigida: " + totalFolhaCorrigida);

    }

}