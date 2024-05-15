import java.util.Locale;
import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();     
        
        System.out.println("Por favor, digite um número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digte o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu Sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Por favor, digite o valor que você deseja depositar: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobreNome);
        System.out.println("obrigado por criar um conta em nosso banco, sua agência é " + agencia);
        System.out.println("conta " + numeroConta);
        System.out.println("e o seu saldo de " + saldo + "já está disponível para saque.");
    }
}
