import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criando o Scanner
        Scanner scanner = new Scanner(System.in);

        //Recebendo os dados do usuário
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        //Pulando linha
        System.out.println();

        //Consome uma linha do scanner
        scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println();


        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println();

        System.out.print("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + ", e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}
