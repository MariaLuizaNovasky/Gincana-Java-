import java.util.Scanner; 
public class Exerc9
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);
        double real;
        double dolar, euro, ienn;
        double cotacao;

        System.out.print("Digite a quantidade em dolar: ");    
        dolar = input.nextDouble(); 

        System.out.print("Digite a cotação do dolar: ");     
        cotacao = input.nextDouble(); 
        
        System.out.print("Digite a cotação do euro: ");     
        euro = input.nextDouble();
        
        System.out.print("Digite a cotação do ienn: ");     
        ienn = input.nextDouble();

        real = dolar * cotacao;
        euro = dolar * cotacao;
        ienn = dolar * cotacao;
        
        System.out.printf("Quantia em reais: " +real+ "R$"); 
        System.out.printf("Quantia em euro: " +euro+ "US$"); 
        System.out.printf("Quantia em ienn: " +ienn+ "R$"); 
    } 
} 