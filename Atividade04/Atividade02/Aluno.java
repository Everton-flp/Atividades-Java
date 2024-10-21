/* 
Everton Felipe Basilio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

package Atividade02;

public class Aluno {
    private String nome;
    private double nota;

    // Construtor
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Getters e Setters
    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public double getnota() {
        return nota;
    }

    public void setnota(double nota) {
        this.nota = nota;
    }

    // Logica para mostrar o conceito da nota do aluno
    public char getConceito() {
        if (nota >= 90) {
            return 'A';
        } else if (nota >= 80) {
            return 'B';
        } else if (nota >= 70) {
            return 'C';
        } else if (nota >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }
    //Override é uma anotação para deixar visivel que redefinimos um comportamento herdado da classe pai
    @Override
    public String toString() {
        return "Aluno: " + nome + ", Nota: " + nota + ", Conceito: " + getConceito();
    }
}
