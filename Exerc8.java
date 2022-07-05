import java.util.Scanner; 
public class Exerc8
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);  
        String nomeAluno;
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double mediaFinal; 
        double frequencia;
        
        System.out.print ("Digite o nome do aluno: ");
        nomeAluno = input.nextLine();
        
        System.out.print("Digite a nota da primeira prova: ");
        nota1 = input.nextDouble();
        
        System.out.print("Digite a nota da segunda prova: ");
        nota2 = input.nextDouble();
        
        System.out.print("Digite a nota da terceira prova: ");
        nota3 = input.nextDouble();
        
        System.out.print("Digite a nota da quarta prova: ");
        nota4 = input.nextDouble();
        
        System.out.print("Digite a frequencia: ");
        frequencia = input.nextDouble();
        
        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println ("Nome do aluno: "+nomeAluno);
        System.out.println ("A media do aluno é: " +mediaFinal); 
        
        if (mediaFinal >= 7 && frequencia >= 75){
            System.out.println ("O aluno esta aprovado");
        }
        
        else if (mediaFinal<=7 && frequencia <75){
            System.out.println ("O aluno esta reprovado");
        }
             
    }
}