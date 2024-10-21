/* 
Everton Felipe Basílio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;

public class Atividade3 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();
        System.out.println("O valor total da compra é R$" + valor + " reais");
        Scanner dc = new Scanner(System.in);
        System.out.println("Digite a porcentagem do desconto: ");
        int desconto = dc.nextInt();
        System.out.println("O valor do desconto é " + desconto + "%");
        double total = valor - (valor * desconto / 100);
        String formato = String.format("%.2f", total);
        System.out.println("O valor final da compra é R$" +  formato + " reais");

        sc.close();
        dc.close();

    } 
}
