// que sirva 5 nomes de candidatos em seguida ter uma votação (no minimo 6votos) e no final mostrar o total de votos e o vencedor. 

import java.util.Scanner; 
public class Exerc10
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);

        
        int votos; 

        do{
            System.out.println("Escolha um candidato: ");
            System.out.println("Ana");
            System.out.println("Julia");
            System.out.println("Camila");
            System.out.println("Samuel");
            System.out.println("Liza");
            System.out.println("Gabriel");

            System.out.print("-->");
            votos= input.nextInt();

            switch(votos){
                case 1: 
                System.out.println("Voce escolheu: Ana");
                break;

                case 2: 
                System.out.println("Voce escolheu: Julia");
                break;

                case 3: 
                System.out.println("Voce escolheu: Camila");
                break;

                case 4: 
                System.out.println("Voce escolheu: Samuel");
                break;

                case 5: 
                System.out.println("Voce escolheu: Liza");
                break;

                case 6: 
                System.out.println("Voce escolheu: Gabriel");
                break;

            }
            break;
            while (num2!=0);

            if(Ana>Julia&&Ana>Camila&&Ana>Samuel&&Ana>Liza&&Ana>Gabriel){
                System.out.print ("Ana e a vencedora!");
            }

            if(Julia>Ana&&Julia>Camila&&Julia>Samuel&&Julia>Liza&&Julia>Gabriel){
                System.out.print ("Julia e o vencedor!");
            }

            if(Camila>Ana&&Camila>Julia&&Camila>Samuel&&Camila>Liza&&Camila>Gabriel){
                System.out.print ("Camila e o vencedor!");
            }

            if(Samuel>Ana&&Samuel>Julia&&Samuel>Camila&&Samuel>Liza&&Samuel>Gabriel){
                System.out.print ("Samuel e o vencedor!");
            }

            if(Liza>Ana&&Liza>Julia&&Liza>Camila&&Liza>Samuel&&Liza>Gabriel){
                System.out.print ("Liza e a vencedora!");
            }

            if(Gabriel>Ana&&Gabriel>Julia&&Gabriel>Camila&&Gabriel>Liza&&Gabriel>Samuel){
                System.out.print ("Gabriel e o vencedor!");
            }
            
            System.out.println("Ana: "+votos);
            System.out.println("Julia: "+votos);
            System.out.println("Camila: "+votos);
            System.out.println("Samuel: "+votos);
            System.out.println("Liza: "+votos);
            System.out.println("Gabriel: "+votos);
            
        }while(votos!=0);
    }
}
