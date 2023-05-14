package software.engenharia;

import java.util.Scanner;
import software.engenharia.client.countbank.Account;

/**
 * BeneTesla
 *
 */
public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o nome do cliente: ");
    String nome = sc.nextLine();
    System.out.println("Digite o sobrenome do cliente: ");
    String sobrenome = sc.nextLine();
    System.out.println("Digite o numero da conta: ");
    int accountNumber = sc.nextInt();
    System.out.println("Digite o saldo da conta: ");
    double balance = sc.nextDouble();
    System.out.println("Digite o tipo da conta: ");
    String type = sc.next();
    System.out.println("Digite o deposito: ");
    double deposito = sc.nextDouble();
    System.out.println("Digite o saque: ");
    double saque = sc.nextDouble();
    System.out.println("Digite a transferencia: ");
    double transferencia = sc.nextDouble();
    Account account = new Account(nome, sobrenome, accountNumber, balance, type, deposito, saque, transferencia);

   
    System.out.println("Digite a opção desejada: ");
    System.out.println("1 - Depositar");
    System.out.println("2 - Sacar");
    System.out.println("3 - Transferir");
    System.out.println("4 - Consultar saldo");
    System.out.println("5 - Sair");
    int opcao = sc.nextInt();
    switch (opcao) {
      case 1:
        System.out.println("Digite o valor a ser depositado: ");
        double valor = sc.nextDouble();
        account.setDeposito(valor);
        System.out.println("Novo saldo: " + account.getBalance());
        break;
      case 2:
        System.out.println("Digite o valor a ser sacado: ");
        valor = sc.nextDouble();
        account.setSaque(valor);
        System.out.println("Novo saldo: " + account.getBalance());
        break;
      case 3:
        System.out.println("Digite o valor a ser transferido: ");
        valor = sc.nextDouble();
        account.setTransferencia(valor);
        System.out.println("Novo saldo: " + account.getBalance());
        break;
        case 4:       
        System.out.println("Saldo: " + account.getBalance());
        break;
        case 5:
        System.out.println("Obrigado por utilizar nossos serviços!");
        case 6:
        System.out.println("Saindo...");
        break;
        default:
        System.out.println("Opção inválida!");
        break;
    }

    System.out.println("Os dados do cliente são: " + account);
    sc.close();
  }
}
