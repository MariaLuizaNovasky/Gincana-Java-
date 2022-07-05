// digitar um valor, se maior que 20 ganhador, menor que 20 perdedor, igual a 20 empatado 

import java.util.Scanner; 
public class exerc4
{ 
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);

        int numero; 

        System.out.println ("Escreva um numero");
        numero = input.nextInt();

        if (numero>20){ 
            System.out.println ("VENCEDOR!!");
        }

        else if (numero<20){
            System.out.println ("PERDEDOR!!");
        }

        else if (numero==20) {
            System.out.println ("EMPATADO!!");
        }  
    }
}
