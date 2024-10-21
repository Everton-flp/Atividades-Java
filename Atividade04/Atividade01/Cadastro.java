/* 
Everton Felipe Basilio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

package Atividade01;

//Uso do HashMap para evitar ID iguais e facilitar a busca
//Uso do Map para associar o ID ao objeto Pessoa

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cadastro {
    private Map<Integer, Pessoa> pessoas = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    // Metodo para adicionar uma pessoa na lista
    public void AdicionarPessoa() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        //Funcao para evitar pessoas com o mesmo id
        if (pessoas.containsKey(id)) {
            System.out.println("ID já existente! Não foi possível inserir.");
            return;
        }

        // Cadastro de uma nova pessoa
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();

        Pessoa pessoa = new Pessoa(id, nome, cpf, dataNascimento);
        pessoas.put(id, pessoa);
        System.out.println("Pessoa inserida com sucesso.");
    }

    // Filtro por ID para alterar uma pessoa
    public void alterarPessoa() {
        System.out.print("ID da pessoa a ser alterada: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if (!pessoas.containsKey(id)) {
            System.out.println("Pessoa não encontrada.");
            return;
        }

        Pessoa pessoa = pessoas.get(id);

        // Alteração dos dados da pessoa solicitada acima
        System.out.print("Novo Nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.print("Novo CPF: ");
        pessoa.setCpf(scanner.nextLine());

        System.out.print("Nova Data de Nascimento: ");
        pessoa.setnascimento(scanner.nextLine());

        System.out.println("Dados alterados com sucesso.");
    }

    // Consultar uma pessoa cadastrada
    public void consultarPessoa() {
        System.out.print("ID da pessoa a ser consultada: ");
        int id = scanner.nextInt();

        if (pessoas.containsKey(id)) {
            System.out.println(pessoas.get(id));
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    // Excluir uma pessoa
    public void excluirPessoa() {
        System.out.print("ID da pessoa a ser excluída: ");
        int id = scanner.nextInt();

        if (pessoas.remove(id) != null) {
            System.out.println("Pessoa excluída com sucesso.");
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    // Menu principal
    public void menu() {
        while (true) {
            System.out.println("\n1. Adicionar Pessoa");
            System.out.println("2. Alterar Pessoa");
            System.out.println("3. Consultar Pessoa");
            System.out.println("4. Excluir Pessoa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    AdicionarPessoa();
                    break;
                case 2:
                    alterarPessoa();
                    break;
                case 3:
                    consultarPessoa();
                    break;
                case 4:
                    excluirPessoa();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.menu();
    }
}