//temperatura em graus C e converter para F e K. 

import java.util.Scanner; 
public class Exerc11
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);
        double c;
        double f; 
        double k;

        System.out.print("Digite a temperatura em Graus Celsius: "); 
        c = input.nextDouble(); 

        f = (9 * c + 160) / 5; 
        k = c + 273;

        System.out.println("A temperatura convertida para Fahrenheit é: " +f); 
        System.out.println("A temperatura convertida para Kelvin é: " +k); 
    }
} 