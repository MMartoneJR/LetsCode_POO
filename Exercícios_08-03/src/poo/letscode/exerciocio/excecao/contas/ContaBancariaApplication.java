package poo.letscode.exerciocio.excecao.contas;

import java.util.Scanner;

public class ContaBancariaApplication {
    public static void main(String[] args) throws ContaException {

        ContaBancaria conta = new ContaBancaria(2500.0, 1000.0);
        int opc = 0;
        double saque = 0, deposito = 0;
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        do{
            System.out.println("Saldo em conta: R$" + conta.getSaldo());
            System.out.println("Limite disponível: R$" + conta.getLimite());
            System.out.println("Saldo + limite: R$" + conta.getSaldoComLimite());

            System.out.println("\nQual operação deseja realizar?");
            System.out.println("[1] - Depósito");
            System.out.println("[2] - Saque");
            System.out.println("[0] - Encerrar sessão");
            opc = sc.nextInt();
            switch(opc){
                case 1:
                    System.out.print("insira o valor do depósito: ");
                    deposito = sc.nextDouble();
                    try{
                        conta.depositar(deposito);
                    }
                    catch (ContaException ce){
                        System.out.println("Somente são aceitos depósitos de até R$1.000,00\n");
                    }
                    break;
                case 2:
                    System.out.print("Insira o valor do saque: ");
                    saque = sc.nextDouble();
                    try{
                        conta.sacar(saque);
                    }
                    catch (ContaException ce){
                        if(saque>500){
                            System.out.println("Valor máximo disponível para saque: R$500,00");
                        }
                        else{
                            System.out.println("Saldo indisponível.");
                        }
                    }
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("Opção inválida\n");
                    break;
            }
        }while(loop);
    }


}
