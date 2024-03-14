import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       //inicializar dados do cliente
        Scanner Dados = new Scanner(System.in);
        int opcao = 0;

        System.out.println("******************");
        System.out.println("\nDados iniciais do cliente: ");
        System.out.print("Nome: ");
        String nome = Dados.nextLine();
        System.out.print("Tipo de conta: ");
        String tipoC = Dados.nextLine();
        System.out.print("Saldo inicial: R$");
        double saldo = Dados.nextDouble();

        //Menu de opções
        while(opcao != 4) {
        System.out.println("\n******************");
        System.out.println("Operações");
        System.out.println("1 - Consultar valor");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");
        System.out.println("Digite a opção desejada");
        opcao = Dados.nextInt();
            switch (opcao) {
                case 1:
                    //Visualização do saldo
                    System.out.println("O saldo atual é R$" + saldo);
                    break;
                case 2:
                    //Receber valor
                    System.out.println("Informe o valor a receber: ");
                    double valorR = Dados.nextDouble();
                    saldo += valorR;
                    System.out.println("Saldo atualizado: " + saldo);
                    break;
                case 3:
                    //Enviar valor
                    System.out.println("Informe o valor que deseja transferir: ");
                    double valorT = Dados.nextDouble();
                    if (valorT > saldo){
                        System.out.println("Saldo insuficiente para transferência desejada!");
                    } else {
                        saldo -= valorT;
                        System.out.println("Saldo atualizado: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }
    }
}