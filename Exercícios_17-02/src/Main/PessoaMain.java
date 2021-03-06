package Main;

import Enums.TipoJornadaEmpregado;
import Metodos.Administrador;
import Metodos.Empregado;
import Metodos.Fornecedor;
import Metodos.Pessoa;
import Metodos.Operario;
import Metodos.Vendedor;
import java.util.Scanner;

public class PessoaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc;

        Pessoa pessoa = new Pessoa
                ("Marcelo", "Rua tals", "99 9999-9999");
        Fornecedor fornecedor = new Fornecedor
                ("Linx", "Endereço da Linx","11 9999-9999", 200000, 150000);
        Empregado empregado = new Empregado
                ("Luiz", "Rua do Luiz", "11 1111-1111", 2, 3000, 3, TipoJornadaEmpregado.PERIODO_COMPLETO.getDescricao());
        Administrador administrador = new Administrador
                ("Luiza", "Rua da Luiza", "12 1111-2111", 1, 5000, 3, 300, TipoJornadaEmpregado.MEIO_PERIODO.getDescricao());
        Operario operario = new Operario
                ("Robson", "Rua do Robson", "13 1113-1111", 3, 2000, 3, 1000, 20, TipoJornadaEmpregado.PERIODO_COMPLETO.getDescricao());
        Vendedor vendedor  = new Vendedor
                ("Walderrama", "Rua do Walderrama", "15 1153-1111", 664, 2500, 3, 15000, 30, TipoJornadaEmpregado.PERIODO_COMPLETO.getDescricao());

        System.out.println("quais dados deseja verificar?");
        System.out.println("1 - Pessoa física");
        System.out.println("2 - Fornecedor");
        System.out.println("3 - Empregado");
        System.out.println("4 - Administrador");
        System.out.println("5 - Operario");
        System.out.println("6 - Vendedor");
        opc = sc.nextInt();

        switch (opc){
            case 1:
                pessoa.fichaCompleta();
                //System.out.println(pessoa.toString());
                break;
            case 2:
                fornecedor.fichaCompleta();
                //System.out.println(fornecedor.toString());
                break;
            case 3:
                empregado.fichaCompleta();
                //System.out.println(empregado.toString());
                break;
            case 4:
                administrador.fichaCompleta();
                //System.out.println(administrador.toString());
                break;
            case 5:
                operario.fichaCompleta();
                //System.out.println(operario.toString());
                break;
            case 6:
                vendedor.fichaCompleta();
                //System.out.println(vendedor.toString());
            default:
                break;
        }
    }
}
