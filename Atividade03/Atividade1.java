/* 
Everton Felipe Basílio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Arrays;
import java.util.Random;

public class Atividade1 {

    public static void main(String[] args) {
        Random aleatorio = new Random();  
        aleatorio.nextInt(11);
        Integer[] vetor = new Integer[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = aleatorio.nextInt(11);
        }
        System.out.println("Numeros gerados: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        Arrays.sort(vetor);
        System.out.println("\nOrdem Crescente:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        Arrays.sort(vetor, (a, b) -> b - a);
        System.out.println("\nOrdem Decrescente:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

