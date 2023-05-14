import services.Robo;

public class App {
    public static void main(String[] args) throws Exception {
        Robo  robo = new Robo();
        robo.cor = "Azul";
        robo.nome = "The exterminator";
        robo.andar();
        robo.exterminar();
        System.out.println("O nome do robo é: " + robo.nome);
        System.out.println("A cor do robo é: " + robo.cor);
    }    
}
