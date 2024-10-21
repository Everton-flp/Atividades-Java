/* 
Everton Felipe Basílio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de alunos: ");
        int alunos = sc.nextInt();

        double [] notas = new double[alunos];

        for (int i = 0; i < alunos; i++){
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
         }

        double maior = notas[0];
        double menor = notas[0];
        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            total += notas[i];
        }

        double media = total / notas.length;

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        String formato = String.format("%.2f", media);
        System.out.println("Media da turma: " + formato);

        sc.close();
    }
}