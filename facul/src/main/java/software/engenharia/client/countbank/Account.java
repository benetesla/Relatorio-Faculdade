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
    private double deposito;
    private double saque;
    private double transferencia;

    public Account(String nome, String sobrenome, int accountNumber, double balance, String type, double deposito, double saque, double transferencia) {
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
    public void menu(int opcao){
        switch (opcao){
            case 1:
                this.depositar();
                break;
            case 2:
                this.Sacar();
                break;
            case 3:
                this.transferir();
                break;
            case 4:
                this.sair();
                break;
        }
    }
@Override
public String toString() {
    return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", deposito=" + deposito + ", saque="
            + saque + ", transferencia=" + transferencia + ", type=" + type + "]";
}

}
