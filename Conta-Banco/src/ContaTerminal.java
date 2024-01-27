import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta ! ");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, me informe o seu nome !");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência ! ");
        agencia = scanner.nextLine();  

        System.out.println( "Por favor Deposite um valor para finalização do seu cadastro");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo " + saldo + "  já está disponível para saque");

    }
}
