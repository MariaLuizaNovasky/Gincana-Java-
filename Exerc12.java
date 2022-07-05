
import java.util.Scanner; 
public class Exerc12
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);
        double valor;
        double div50, div10, div5, div2;
        
        System.out.println ("Coloque um valor: ");
        valor = input.nextDouble(); 
        
        div50 = valor / 50;
        div10 = valor / 10;
        div5 = valor / 5;
        div2 = valor / 2;
        
        System.out.println ("Tantas notas de 50: " +div50);
        System.out.println ("Tantas notas de 10: " +div10);
        System.out.println ("Tantas notas de 5: " +div5);
        System.out.println ("Tantas notas de 2: " +div2);
        
    }
}