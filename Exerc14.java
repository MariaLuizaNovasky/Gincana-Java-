// caixa eletronica: deposito(2), saque(1), pagamentos(1), saldo. 

import java.util.Scanner; 
public class Exerc14
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);
        double saldo, deposito,saque,pagamento;
        String destinatario,codigo;
        int opcao;
        saldo = 0;

        do{
            System.out.println("Escolha um opção: ");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque" );
            System.out.println("3 - pagamento");
            System.out.println("4 - saldo");    

            System.out.print("-->");
            opcao= input.nextInt();

            switch(opcao){
                case 1: 
                System.out.print("Quanto deseja depositar: ");
                deposito = input.nextDouble();
                saldo = saldo + deposito;
                break;

                case 2: 
                System.out.print("Quanto deseja sacar: ");
                saque  = input.nextDouble();
                if (saque<saldo){
                    saldo = saldo - saque; 
                } else{
                    System.out.println("Saldo insulficiente \n");
                }
                break;

                case 3: 
                System.out.print("3 - Entre com o valor de seu pagamento: ");
                pagamento = input.nextDouble();
                if (pagamento<saldo){
                    saldo = saldo - pagamento;
                }
                break;

                case 4: 
                System.out.print("4 - Saldo: " +saldo);
                break;
            }
        }while (opcao!=0);
    }
}

