import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();   

        System.out.println("Digite o saldo da sua conta: ");
        int saldo = scanner.nextInt();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+ ", conta "+numero+ " e seu saldo "+ saldo + " 10já está disponível para saque");
    }
}
