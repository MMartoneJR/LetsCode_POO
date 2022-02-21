package Mains;

import Metodos.Administrador;
import Metodos.Empregado;
import Metodos.Fornecedor;
import Metodos.Pessoa;
import Metodos.Operario;
import Metodos.Vendedor;
import java.util.Scanner;

public class Pessoa_main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = 0;

        Pessoa pessoa = new Pessoa("Marcelo", "Rua tals", "99 9999-9999");
        Fornecedor fornecedor = new Fornecedor("Linx", "Endereço da Linx","11 9999-9999", 200000, 150000);
        Empregado empregado = new Empregado("Luiz", "Rua do Luiz", "11 1111-1111", 001, 3000, 3);
        Administrador administrador = new Administrador("Luiza", "Rua da Luiza", "12 1111-2111", 001, 5000, 3, 300);
        Operario operario = new Operario("Robson", "Rua do Robson", "13 1113-1111", 734, 2000, 3, 1000, 20);
        Vendedor vendedor  = new Vendedor("Walderrama", "Rua do Walderrama", "15 1153-1111", 664, 2500, 3, 15000, 30);

        System.out.println("quais dados deseja verificar?");
        System.out.println("1 - Pessoa física;");
        System.out.println("2 - Fornecedor;");
        System.out.println("3 - Empregado;");
        System.out.println("4 - Administrador;");
        System.out.println("5 - Operario;");
        System.out.println("6 - Vendedor;");
        opc = sc.nextInt();

        switch (opc){
            case 1:
                pessoa.fichaCompleta();
                break;
            case 2:
                fornecedor.fichaCompleta();
                break;
            case 3:
                empregado.fichaCompleta();
                break;
            case 4:
                administrador.fichaCompleta();
                break;
            case 5:
                operario.fichaCompleta();
                break;
            case 6:
                vendedor.fichaCompleta();
            default:
                break;
        }
    }
}
