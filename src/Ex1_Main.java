import java.util.Scanner;

public class Ex1_Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = -1;
        Ex1_Funcionario funcionario = new Ex1_Funcionario();


        System.out.println("Cadastro de funcionário");
        System.out.print("Digite o nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Digite o sobrenome: ");
        funcionario.sobrenome = sc.nextLine();
        System.out.print("Digite a cidade: ");
        funcionario.cidade = sc.nextLine();
        System.out.print("Digite o estado: ");
        funcionario.estado = sc.nextLine();
        System.out.print("Horas trabalhadas: ");
        funcionario.horasTrab = sc.nextInt();
        System.out.print("Valor por hora: R$");
        funcionario.valorHora = sc.nextDouble();

        System.out.println();
        funcionario.fichaCompleta();

        while(opc!=0){
            System.out.println();
            System.out.println("Deseja realizar alguma alteração?");
            System.out.println("1 - adicionar horas trabalhadas");
            System.out.println("2 - alterar o valor recebido por hora");
            System.out.println("3 - Conferir o saldo a receber no final do mês");
            System.out.println("4 - Sair");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Digite o total de horas a ser adicionado:");
                    funcionario.horasTrab += sc.nextInt();
                    break;
                case 2:
                    System.out.println("Digite o novo valor por hora: ");
                    funcionario.valorHora = sc.nextDouble();
                    break;
                case 3:
                    funcionario.salarioMes();
                    break;
                case 4:
                    opc = 0;
                    break;
            }

        }
    }
}
