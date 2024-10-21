/* 
Everton Felipe Basílio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;
import java.math.BigInteger;

public class Atividade2 {
    

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero  = sc.nextInt() ;
    
        if (numero % 2 == 0) {System.out.println(numero + " É par");
             }
        else{System.out.println(numero +" É Ímpar");
            }

        if (numero > 0){System.out.println(numero + " É positivo");
             }
        else if(numero == 0){System.out.println(numero +" É nulo");
            }
        else{System.out.println(numero +" É negativo");
            } 

        int numeroInt = (int) numero;
        boolean primo = BigInteger.valueOf(numeroInt).isProbablePrime(100);
        if (primo == true){System.out.println(numero + " É primo");
          }
        else{System.out.println(numero + " Não é primo");
         }

        double raiz;
        raiz = Math.sqrt(numero);
        String formato = String.format("%.2f", raiz);
        System.out.println("A raiz quadrada de " + numero + " é: " + formato);
        System.out.println(numero + " Elevado a 3 é: " + Math.pow (numero,3));

        sc.close();
    }
}    
