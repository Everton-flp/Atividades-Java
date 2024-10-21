/* 
Everton Felipe Basílio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        do {
            System.out.println("Digite sua nota: ");
            nota = sc.nextDouble();
            if (nota <= 0 || nota >= 100) {
                System.out.println("Número inválido. Por favor, digite um número entre 0 e 100.");
            }
        } while (nota <= 0 || nota >= 100);

        if (nota > 90) {
            System.out.println("Nota A!! Parabens continue assim!");
        } else if (nota >= 80) {
            System.out.println("Nota B!! Voce esta quase la, mais um pouco e voce consegue!");
        } else if (nota >= 70) {
            System.out.println("Nota C!! Estude um pouco mais.");
        } else if (nota >= 60) {
            System.out.println("Nota D!! Foi por pouco, tenha mais atenção durante as aulas");
        } else {
            System.out.println("Nota E!! Reprovado.");
        }
        sc.close();
    }
}