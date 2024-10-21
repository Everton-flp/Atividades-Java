/* 
Everton Felipe Basílio da Silva
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

public class Atividade4 {
    public static void main (String [] args){

        int a = 1;
        int b = 1;

        for(int i = 1; i <= 11; i ++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            
        }
    
    }
}
