/* 
Everton Felipe Basílio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Random;
import java.util.Scanner;

public class Atividade5 {

    public static void main (String [] args){

        Random rnd = new Random();
        int x = rnd.nextInt(11);
        int num;

        Scanner scanner = new Scanner(System.in);

        do {
        System.out.println("Digite um numero entre 0 e 10: ");
        num = scanner.nextInt();

            while (num < 0 || num > 10) {
            System.out.println("Número inválido! Digite um número entre 0 e 10: ");
            num = scanner.nextInt();
            }
            if (num > x ){System.out.println("O numero é menor.");
            }
            else if (num < x){System.out.println("O numero é maior.");
            }  
        } while(num != x);

        System.out.println("Parabens! voce acertou!");
        scanner.close();
    } 
}
