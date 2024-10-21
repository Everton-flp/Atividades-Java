/* 
Everton Felipe Basílio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;

public class Atividade1 {
   public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String  palavra  = sc.nextLine() ;
        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("A palavra digitada tem: " + palavra.length() + " letras");
        System.out.println("A primeira letra da palavra digitada foi: " + palavra.charAt(0));
        
        int centro = palavra.length() / 2;
        if (palavra.length() % 2 == 0) {
            System.out.println("A letra central da palavra digitada é: " + palavra.charAt(centro - 1) + " e " + palavra.charAt(centro));
        } else {
            System.out.println("A letra central da palavra digitada é: " + palavra.charAt(centro));
        }
        
        System.out.println("A ultima letra da palavra digitada é: " + palavra.charAt(palavra.length()-1));
        StringBuilder reverse = new StringBuilder(palavra);
        String PalavraReversa = reverse.reverse().toString();
        System.out.println("A palavra digitada ao contrario fica " + PalavraReversa);
        System.out.println("A palavra digitada em maiusculo fica: " + palavra.toUpperCase());
        System.out.println("A palavra digitada em minusculo fica: " + palavra.toLowerCase());
     
         sc.close();
      }

   }

