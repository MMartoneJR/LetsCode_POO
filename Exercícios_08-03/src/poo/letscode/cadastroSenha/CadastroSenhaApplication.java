package poo.letscode.cadastroSenha;

import java.util.Objects;
import java.util.Scanner;

public class CadastroSenhaApplication {
    public static void main(String[] args) throws SenhaIncorretaException{

        String cadastroSenha, senha;
        int valA = 0, valB = 0;
        double divisao =0;
        boolean validaDivisao = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cadastrar senha: ");
        cadastroSenha = sc.next();

        System.out.print("Digite o primeiro valor: ");
        valA =sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        valB = sc.nextInt();

        System.out.println("Digite a senha para obter o resultado da divisão:");
        senha = sc.next();
        if (!Objects.equals(senha, cadastroSenha)){
            throw new SenhaIncorretaException("Senha incorreta");
        }else{
            try{
                divisao = valA / valB;
            }
            catch(ArithmeticException ae) {
            System.out.println("Não é posível dividir por 0");
            validaDivisao = false;
            }
            if(validaDivisao) {
            System.out.printf("Divisão: %.2f", divisao);
            }
        }
    }
}
