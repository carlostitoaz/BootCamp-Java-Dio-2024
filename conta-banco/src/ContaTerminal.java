import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner leia = new Scanner(System.in);
        
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        int numero;
        String agencia, nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite o número da conta!");
        numero = leia.nextInt();

        System.out.println("Por favor, digite o número da agencia!");
        agencia = leia.next();

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = leia.nextLine();

        leia.nextLine();

        System.out.println("Por favor, digite o saldo!");
        saldo = leia.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco,"
        +"sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        
    }
}
