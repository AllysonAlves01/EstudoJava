import java.util.Locale;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        ContaTerminal conta = new ContaTerminal();
        
        System.out.println("Por favor, digite o número da conta: ");
        conta.numeroConta = scanner.nextInt();

        System.out.println("Por favor, me informe o seu nome: ");
        conta.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        conta.agencia = scanner.nextLine();  

        System.out.println( "Por favor Deposite um valor para finalização do seu cadastro: ");
        conta.saldo = scanner.nextDouble();

        System.out.println("Olá " + conta.nomeCliente + " Obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + " conta " + conta.numeroConta + " e seu saldo " + conta.saldo + "  já está disponível para saque");
     
    }
}
