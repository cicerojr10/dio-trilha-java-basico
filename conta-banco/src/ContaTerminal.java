import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Scanner em um bloco try-with-resources
        try (Scanner scanner = new Scanner(System.in)) { 

        // Declaração de variáveis para armazenar dados da conta
        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;

        // Coleta de dados do usuário
        System.out.println("** Criação de Conta Bancária **");

        System.out.print("Por favor, digite o número da agência: ");
        numeroAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();

        scanner.nextLine(); // Limpar buffer do scanner

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        String saldoString; // Variável para armazenar a entrada do saldo como string
        do {
            System.out.print("Por favor, digite o saldo inicial (ex: 123.45): ");
            saldoString = scanner.next();
        } while (!saldoString.matches("\\d+(\\.\\d+)?")); // Validação do formato decimal

        saldo = Double.parseDouble(saldoString); // Conversão da string para double

        // Apresentação dos dados da conta
        System.out.println("\n** Conta Criada com Sucesso! **");
        System.out.println("---------------------------------");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar sua conta em nosso banco, sua agencia é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo "
        + saldo + " já está disponível para saque.");

        }
    }

}