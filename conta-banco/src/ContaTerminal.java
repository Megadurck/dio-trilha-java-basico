import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Digite o número da agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Informe o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        


     

        

        
    }
}
