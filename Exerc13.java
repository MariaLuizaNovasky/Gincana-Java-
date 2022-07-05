//lista de dvds, 4dvds, 

import java.util.Scanner; 
public class Exerc13
{ 
    public static void main(String[] args){

    String dvd1, dvd2, dvd3, dvd4, dvd5,dvd;
    int soma, ValorTotal;
    int comprados;
    
    do{
            System.out.println("Escolha um dvd da Saga Barbie: ");
            System.out.println("dvd1 - Barbie: escola de princesas" +50);
            System.out.println("dvd2 - Barbie Lago dos cisnes"+20);
            System.out.println("dvd3 - Barbie: A princesa e a pop stars" +10);
            System.out.println("dvd4 - Barbie e as tres mosqueteiras" +50);
            System.out.println("dvd5 - Barbie e as 12 bailarinas" +15);

            System.out.print("-->");
            dvd= input.nextInt();

            switch(dvd){
                case 1: 
                System.out.println("Voce escolheu: dvd1 - Barbie: escola de princesas");
                comprados = comprados+1;
                valor = valor + 50;
                break;

                case 2: 
                System.out.println("Voce escolheu: dvd2 - Barbie Lago dos cisnes");
                comprados = comprados+1;
                valor = valor + 50;
                break;

                case 3: 
                System.out.println("Voce escolheu: dvd3 - Barbie: A princesa e a pop stars");
                comprados = comprados+1;
                valor = valor + 10;
                break;

                case 4: 
                System.out.println("Voce escolheu: dvd4 - Barbie e as tres mosqueteiras");
                comprados = comprados+1;
                valor = valor + 50;
                break;

                case 5: 
                System.out.println("Voce escolheu: dvd5 - Barbie e as 12 bailarinas");
                comprados = comprados+1;
                valor = valor + 15;
                break;
            }
        }while (comprados=2);
            System.out.println ("Valor total:" +valor);
                 
        }
    }
}