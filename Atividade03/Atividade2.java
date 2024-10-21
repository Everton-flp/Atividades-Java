/* 
Everton Felipe Basílio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        ArrayList<String[]> listaUsuarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Usuários iniciais
        listaUsuarios.add(new String[]{"1", "Marcos", "14/03/1998"});
        listaUsuarios.add(new String[]{"2", "Joao",   "13/09/1987"});
        listaUsuarios.add(new String[]{"3",  "Ana",   "16/06/1992"});
        listaUsuarios.add(new String[]{"4", "Maria",  "19/07/2005"});

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inserir pessoa");
            System.out.println("2. Alterar dados da pessoa");
            System.out.println("3. Consultar dados da pessoa");
            System.out.println("4. Excluir dados de uma pessoa");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    // Inserir pessoa
                    System.out.print("Digite o ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
                    String dataNascimento = scanner.nextLine();
                    listaUsuarios.add(new String[]{id, nome, dataNascimento});
                    System.out.println("Pessoa adicionada com sucesso!");
                    break;

                case 2:
                    // Alterar dados da pessoa
                    System.out.print("Digite o ID da pessoa a ser alterada: ");
                    String idAlterar = scanner.nextLine();
                    boolean encontrado = false;
                    for (String[] usuario : listaUsuarios) {
                        if (usuario[0].equals(idAlterar)) {
                            encontrado = true;
                            System.out.print("Novo nome: ");
                            usuario[1] = scanner.nextLine();
                            System.out.print("Nova data de nascimento: ");
                            usuario[2] = scanner.nextLine();
                            System.out.println("Dados alterados com sucesso!");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case 3:
                    // Consultar dados da pessoa
                    System.out.print("Digite o ID da pessoa a ser consultada: ");
                    String idConsultar = scanner.nextLine();
                    encontrado = false;
                    for (String[] usuario : listaUsuarios) {
                        if (usuario[0].equals(idConsultar)) {
                            encontrado = true;
                            System.out.println("ID: " + usuario[0] + ", Nome: " + usuario[1] + ", Data de Nascimento: " + usuario[2]);
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case 4:
                    // Excluir dados de uma pessoa
                    System.out.print("Digite o ID da pessoa a ser excluída: ");
                    String idExcluir = scanner.nextLine();
                    encontrado = false;
                    for (int i = 0; i < listaUsuarios.size(); i++) {
                        if (listaUsuarios.get(i)[0].equals(idExcluir)) {
                            listaUsuarios.remove(i);
                            encontrado = true;
                            System.out.println("Pessoa excluída com sucesso!");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
