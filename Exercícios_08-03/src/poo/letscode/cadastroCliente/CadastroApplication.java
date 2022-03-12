package poo.letscode.cadastroCliente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroApplication {
    public static void main(String[] args) {
        String nome;
        int cpf = 0;
        double rendaMensal = 0;
        int tentativas = 0;
        boolean cpfValido = true;
        boolean rendaValida = true;
        boolean fimCadastro = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("---Cadastro de cliente---");

        do {
            System.out.print("Digite seu nome: ");
            nome = sc.next();

            System.out.print("Digite seu cpf: ");
            try {
                cpf = sc.nextInt();

            } catch (InputMismatchException ime) {
                System.out.println("Valor inválido inserido");
                cpfValido = false;
                sc.next();
            }


            System.out.print("Digite sua renda mensal:");
            try {
                rendaMensal = sc.nextDouble();
                sc.next();

            } catch (InputMismatchException ime) {
                System.out.println("Valor inválido inserido");
                rendaValida = false;
                sc.next();
            }
            System.out.println("");


            if (tentativas == 2) {
                fimCadastro = true;
            } else if (!cpfValido || !rendaValida) {
                tentativas++;
                cpfValido = true;
                rendaValida = true;
            } else {
                fimCadastro = true;
            }

        } while (!fimCadastro);

        if (tentativas == 2) {
            System.out.println("Você esgotou as tentativas de cadastro, tente novamente mais tarde.");
        } else {
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Renda Mensal: " + rendaMensal);
        }


    }
}
