import java.util.Scanner; 
public class Exerc2
{ 
    public static void main(String[] args){
    Scanner input=new Scanner (System.in);
    
    int a;
    int b;
    int c;
    int soma;
    
    System.out.println ("Escreva um numero para a: ");
    a = input.nextInt();
    
    System.out.println ("Escreva um numero para b: ");
    b = input.nextInt();
    
    System.out.println ("Escreva um numero para c: ");
    c = input.nextInt();
    
    soma = a + b + c;
    
    System.out.println ("O resultado da soma é: " +soma);
    
    
}
}