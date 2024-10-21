/* 
Everton Felipe Basilio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

package Atividade01;
public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String nascimento;

    // Construtor
    public Pessoa(int id, String nome, String cpf, String nascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    // Getters e Setters
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getnascimento() {
        return nascimento;
    }

    public void setnascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    //Override é uma anotação para deixar visivel que redefinimos um comportamento herdado da classe pai
    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", CPF: " + cpf + 
               ", Data de Nascimento: " + nascimento;
    }
}
