/* 
Everton Felipe Basílio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;

public class Atividade1{

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int opcao ;

        do {
        System.out.println("QUAL OPERACAO MATEAMTICA DESEJA FAZER? ");
        System.out.println("DIGITE 1 PARA ADICAO: ");
        System.out.println("DIGITE 2 PARA SUBTRACAO: ");
        System.out.println("DIGITE 3 PARA MULTIPLICACAO: ");
        System.out.println("DIGITE 4 PARA DIVISAO: ");
        System.out.println("DIGITE 0 PARA SAIR: ");
        opcao = scanner.nextInt();
        
        switch (opcao){
            
                case 1:
                    System.out.println("Digite o primeiro numero: ");
                    float num1 = scanner.nextFloat();
                    System.out.println("Digite o segundo numero: ");
                    float num2 = scanner.nextFloat();
                    float soma = num1 + num2;
                    System.out.println("A soma de " + num1 + " + " + num2 + " = " + soma); 
                    
                    break;
                
                case 2:
                    System.out.println("Digite o primeiro numero: ");
                    float num3 = scanner.nextFloat();
                    System.out.println("Digite o segundo numero: ");
                    float num4 = scanner.nextFloat();
                    float sub = num3 - num4;
                    System.out.println("A subtração de " + num3 + " - " + num4 + " = " + sub);
                    break;  
                
                case 3:
                    System.out.println("Digite o primeiro numero: ");
                    float num5 = scanner.nextFloat();
                    System.out.println("Digite o segundo numero: ");
                    float num6 = scanner.nextFloat();
                    float mult = num5 * num6;
                    System.out.println("A multiplicação de " + num5 + " * " + num6 + " = " + mult);
                    break;  


                case 4:
                    System.out.println("Digite o primeiro numero: ");
                    float num7 = scanner.nextFloat();
                    System.out.println("Digite o segundo numero: ");
                    float num8 = scanner.nextFloat();
                    float resto = num7 / num8;
                    if (num8 == 0) {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    }   
                    else
                        System.out.println("A divisão de " + num7 + " / " + num8 + " = " + resto);
                    break; 
                case 0:
                    System.out.println("Saindo...");
                    break;
                    
                default:System.out.println("Escolha invalida");
                
                    break;
                }
                
             {
                
            }
            
        }
        while (opcao != 0);
        scanner.close();
    }
       
}