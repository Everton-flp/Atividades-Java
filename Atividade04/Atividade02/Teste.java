/* 
Everton Felipe Basilio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

package Atividade02;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do aluno
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Nota do aluno: ");
        double nota = scanner.nextDouble();

        // Criação do objeto Aluno
        Aluno aluno = new Aluno(nome, nota);

        // Exibe os dados do aluno e o conceito da nota
        System.out.println(aluno);

        scanner.close();
    }
}