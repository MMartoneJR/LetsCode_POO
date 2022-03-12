package poo.letscode.calculadora;


import java.util.Scanner;

public class CalculadoraApplication {
    public static void main(String[] args) {

        int valA = 0;
        int valB = 0;
        double soma = 0;
        double subtracao = 0;
        double multiplicacao = 0;
        double divisao = 0;
        boolean validaDivisao = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("---CALCULADORA---");

        System.out.print("\nDigite o valor de A: ");
        while(true) {
            try {
                valA = sc.nextInt();
                break;
            } catch (NumberFormatException  nfe) {
                System.out.print("Valor invalido inserido, digite novamente: ");
            }
        }

        System.out.print("Digite o valor de B: ");
        while(true) {
            try {
                valB = sc.nextInt();
                break;
            } catch (NumberFormatException  nfe) {
                System.out.print("Valor invalido inserido, digite novamente: ");
            }
        }

        soma = valA + valB;
        System.out.println("\nSoma: "+ soma);

        subtracao= valA - valB;
        System.out.println("Subtração: "+ subtracao);

        multiplicacao= valA * valB;
        System.out.println("Multiplicação: "+ multiplicacao);

        try {
            divisao = valA / valB;
        }catch(ArithmeticException ae) {
            System.out.println("Não é posível dividir por 0");
            validaDivisao = false;
        }
        if(validaDivisao) {
            System.out.printf("Divisão: %.2f", divisao);
        }
    }
}
