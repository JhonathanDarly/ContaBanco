import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Por gentileza digite o seu numero da conta: (Somente numeros)");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por gentileza digite o numero da sua agência ");
        String agencia = sc.nextLine();

        System.out.println("Agora informe seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Qual seu saldo atual? (Somente numeros)");
        double saldo = sc.nextDouble();

        System.out.println("*****====================================================================================================================================*****");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+ ", conta " + numero + " e seu saldo " +  saldo + " já está disponível para saque");
        System.out.println("*****====================================================================================================================================*****");

            sc.close();
    }
}
