/* 
Everton Felipe Basilio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

package Atividade03;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters e Setters
    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getcargo() {
        return cargo;
    }

    public void setcargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Calculos do reajuste do novo salario
    public double reajuste(double porcentagem) {
        salario += salario * (porcentagem / 100);
        return salario;
    }
    
    //Override é uma anotação para deixar visivel que redefinimos um comportamento herdado da classe pai
    @Override
    public String toString() {
        return "Funcionário: " + nome + 
               ", Cargo: " + cargo + 
               ", Salário: R$ " + String.format("%.2f", salario);
    }
}