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
    String deposito = sc.next();
    System.out.println("Digite o saque: ");
    String saque = sc.next();
    System.out.println("Digite a transferencia: ");
    String transferencia = sc.next();
    Account account = new Account(
      nome,
      sobrenome,
      transferencia,
      transferencia,
      transferencia,
      transferencia,
      transferencia,
      accountNumber,
      balance,
      type,
      deposito,
      saque,
      transferencia
    );
    System.out.println("Os dados do cliente são: " + account);
    sc.close();
  }
}
