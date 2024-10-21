/* 
Everton Felipe Basílio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;

public class Atividade2{

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int opcao ;
        
        do {
            System.out.println("DIGITE 1 SE DESEJA FAZER A REGRA DE TRÊS:");
            System.out.println("DIGITE 0 PARA SAIR:");
            opcao = scanner.nextInt();
        switch (opcao){

                case 1:
                System.out.println("DIGITE O PRIMEIRO VALOR: ");
                float num1 = scanner.nextFloat();
                System.out.println("DIGITE A REFERENCIA DO PRIMEIRO VALOR: ");
                float refnum1 = scanner.nextFloat();
                System.out.println("DIGITE O SEGUNDO VALOR: ");
                float num2 = scanner.nextFloat();
                float refnum2 = num2 * refnum1 / num1;
                System.out.println("ASSIM COMO " + num1 + " ESTA PARA "  + refnum1 + " : ");
                System.out.println(num2 + " ESTA PARA " + refnum2 + ": ");
                System.out.println();

                break;

                case 0:
                System.out.println("Saindo...");
                break;

                 default:
                System.out.println("Escolha invalida");
                break;
            } 
        }while (opcao != 0);
        scanner.close();
    }
}   