# ContaBanco - Desafio DIO - Trilha Java Básico
## Descrição
Este projeto foi desenvolvido para resolver o desafio da Trilha Java Básico da plataforma DIO (Digital Innovation One), com foco em Sintaxe de Java e entrada de dados via terminal.

O programa solicita ao usuário informações sobre uma conta bancária, como o número da conta, agência, nome do cliente e saldo. Após a entrada dos dados, o sistema exibe uma mensagem personalizada com as informações fornecidas.

## Autores
Gleyson Sampaio

Jhonathan Darly 

## Funcionalidades
O projeto realiza as seguintes funcionalidades:

## Entrada de dados via terminal:
* O usuário será solicitado a inserir as informações de uma conta bancária: número da conta, agência, nome do cliente e saldo.

* Exibição de mensagem personalizada:

* Após a inserção dos dados, o programa exibe a mensagem:

"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque."

## Como Executar
Requisitos
Java 8 ou superior instalado no seu sistema.

IDE (opcional): Pode ser utilizado qualquer IDE de sua preferência, como IntelliJ IDEA, Eclipse, NetBeans, ou editor de texto.

## Passos Clone o repositório:



git clone https://github.com/JhonathanDarly/ContaBanco.git

Entre na pasta do projeto:

cd ContaBanco

Compile e execute a classe ContaTerminal.java:

## No terminal, execute os seguintes comandos:

javac ContaTerminal.java

java ContaTerminal

## Entrada de Dados:

 O programa irá pedir as seguintes informações:

* Número da conta

* Agência

* Nome do cliente

* Saldo

- Após inserir os dados, a mensagem personalizada será exibida no terminal.

## Estrutura do Projeto
ContaTerminal.java: Classe principal que contém o método main e realiza a interação com o usuário através da classe Scanner. Esta classe coleta as entradas e exibe a mensagem final.

## Código

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Por gentileza digite o seu numero de usuario: (Somente numeros)");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por gentileza digite o numero da sua agência ");
        String agencia = sc.nextLine();

        System.out.println("Agora informe seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Qual seu saldo atual? (Somente numeros)");
        double saldo = sc.nextDouble();

        System.out.println("*****=====================================================================================================================================*****");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+ ", conta " + numero + " e seu saldo " +  saldo + " já está disponível para saque");
        System.out.println("*****=====================================================================================================================================*****");

            sc.close();
    }
}
## Tecnologias Utilizadas
Java: Linguagem de programação usada para implementar o programa.
Scanner: Biblioteca Java utilizada para capturar dados inseridos pelo usuário no terminal.
## Contribuição
Se você deseja contribuir com melhorias ou correções para este projeto, fique à vontade para abrir uma issue ou pull request.

## Licença
Este projeto é de código aberto e pode ser utilizado de acordo com os termos da licença MIT.

