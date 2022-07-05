import java.util.Scanner; 
public class Exerc3
{ 
    public static void main(String[] args){
    Scanner input=new Scanner (System.in);
    
    int salarioBase, salarioFinal;
    int soma;
    int subt;
    
    System.out.println ("Escreva o sálario do funcionario: ");
    salarioBase = input.nextInt();
    
    soma = (salarioBase * 15) /100;
    salarioFinal = (soma * 9) /100;
    
    System.out.print ("O resultado do funcionario é: " +salarioFinal);
}
}