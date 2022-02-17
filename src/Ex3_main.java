import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex3_main {
    public static void main(String[] args) {

        Ex3_Veiculo veiculo = new Ex3_Veiculo();
        Scanner sc = new Scanner(System.in);
        int opc = -1;

        System.out.println("Veiculo");

        System.out.print("Digite a marca: ");
        veiculo.marca = sc.nextLine();
        System.out.print("Digite o modelo: ");
        veiculo.modelo = sc.nextLine();
        System.out.print("Digite o ano: ");
        veiculo.ano = sc.nextInt();

        veiculo.velocidade = 10;
        System.out.println("Veículo andando a "+veiculo.velocidade+"km/h");

        System.out.println("Digite a velocidade máxima da via: ");
        veiculo.velocidadeMax = sc.nextInt();


        while(opc !=0){
            System.out.println("Selecione uma ação:");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Freiar");
            System.out.println("0 - Sair");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.print("Digite qual a velocidade desejada: ");
                    veiculo.acelerar = sc.nextInt();
                    veiculo.acelerar(veiculo.acelerar);
                    System.out.println("Velocidade atual: "+veiculo.velocidade+"km/h");
                    break;
                case 2:
                    veiculo.freiar();
                    break;
                case 0:
                    break;
            }
        }
    }
}
