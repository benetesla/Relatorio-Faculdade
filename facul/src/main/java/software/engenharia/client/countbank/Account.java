package software.engenharia.client.countbank;
import lombok.Getter;
import lombok.Setter;
import software.engenharia.client.clientinfo.Cliente;

@Getter
@Setter
public class Account extends Cliente{
    private int accountNumber;
    private double balance;
    private String type;
    private String deposito;
    private String saque;
    private String transferencia;

    public Account(String nome, String sobrenome, String rg, String email, String phone, String address, String password, int accountNumber, double balance, String type, String deposito, String saque, String transferencia) {
        super(nome, sobrenome);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.type = type;
        this.deposito = deposito;
        this.saque = saque;
        this.transferencia = transferencia;
    }
    public void depositar(){
        System.out.println("Digite o valor a ser depositado: ");
        double valor = 0;
        this.balance += valor;
        System.out.println("Deposito realizado com sucesso!");
    }
    public void Sacar(){
        System.out.println("Digite o valor a ser sacado: ");
        double valor = 0;
        this.balance -= valor;
        System.out.println("Saque realizado com sucesso!");
    }
    public void transferir(){
        System.out.println("Digite o valor a ser transferido: ");
        double valor = 0;
        this.balance -= valor;
        System.out.println("Transferencia realizada com sucesso!");
    }
    public void sair(){
        System.out.println("Obrigado por utilizar nossos serviços!");
    }
    public void menu(){
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Transferir");
        System.out.println("4 - Sair");      
        String opcao = "";
        switch (opcao){
            case "1":
                depositar();
                break;
            case "2":
            Sacar();
                break;
            case "3":
                transferir();
                break;
            case "4":
                sair();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
@Override
public String toString() {
    return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", deposito=" + deposito + ", saque="
            + saque + ", transferencia=" + transferencia + ", type=" + type + "]";
}

}
