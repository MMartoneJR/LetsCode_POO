package Mains;

import Metodos.Fornecedor;
import Metodos.Pessoa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pessoa_main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = 0;

        Pessoa pessoa = new Pessoa("Marcelo", "Rua tals", "99 9999-9999");
        Fornecedor fornecedor = new Fornecedor("Linx", "Endereço da Linx","11 9999-9999", 200000, 150000);

        System.out.println("quais dados deseja verificar?");
        System.out.println("1 - Pessoa física;");
        System.out.println("2 - Fornecedor.");
        opc = sc.nextInt();

        switch (opc){
            case 1:
                pessoa.fichaCompleta();
                break;
            case 2:
                fornecedor.fichaCompleta();
                break;
            default:
                break;
        }




    }
}
