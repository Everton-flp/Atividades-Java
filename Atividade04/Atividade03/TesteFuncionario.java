/* 
Everton Felipe Basilio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

package Atividade03;

import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do funcionário
        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Cargo do funcionário: ");
        String cargo = scanner.nextLine();

        System.out.print("Salário do funcionário: ");
        double salario = scanner.nextDouble();

        // Criação do objeto Funcionario
        Funcionario funcionario = new Funcionario(nome, cargo, salario);

        // Dados iniciais
        System.out.println("\nDados iniciais: " + funcionario);

        // Reajuste
        System.out.print("\nInforme a porcentagem de reajuste: ");
        double porcentagem = scanner.nextDouble();
        funcionario.reajuste(porcentagem);

        // Dados atualizados
        System.out.println("\nDados atualizados: " + funcionario);

        scanner.close();
    }
}
