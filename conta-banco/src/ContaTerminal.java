import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis para armazenar dados da conta
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Coleta de dados do usuário
        System.out.println("** Seja bem-vindo ao Banco XYZ! **");
        System.out.println("** Criação de Conta Bancária **");

        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();

        scanner.nextLine(); // Limpar buffer do scanner

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        String saldoString; // Variável para armazenar a entrada do saldo como string
        do {
            System.out.print("Por favor, digite o saldo inicial (ex: 123,45): ");
            saldoString = scanner.next();
        } while (!saldoString.matches("\\d+(\\.\\d+)?")); // Validação do formato decimal

        saldo = Double.parseDouble(saldoString); // Conversão da string para double

        // Apresentação dos dados da conta
        System.out.println("\n** Conta Criada com Sucesso! **");
        System.out.println("---------------------------------");
        System.out.println("Olá " + nomeCliente + ",");
        System.out.println("Sua conta (" + numeroConta + ") foi criada na agência " + agencia + ".");
        System.out.println("Seu saldo inicial é de R$ " + saldo + ".");
        System.out.println("---------------------------------");

        System.out.println("\n** Obrigado por criar uma conta no Banco XYZ! **");
    }
}
