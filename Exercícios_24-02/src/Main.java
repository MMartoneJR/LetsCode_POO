import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        LampadaFluorescente LampadaFluorescente = new LampadaFluorescente();
        LampadaIncandescente LampadaIncandescente = new LampadaIncandescente();
        Lampada lampada = new Lampada();

        boolean ligar = true;
        boolean desligar = true;
        boolean status = true;
        boolean continuar = true;
        int opcLampada = 0, opcStatus = 0, opcContinuar = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Status atual das lâmpadas: ");
        System.out.println(LampadaFluorescente.StatusAtual());
        System.out.println(LampadaIncandescente.StatusAtual());

        do {
            System.out.println("");

            System.out.println("Qual lâmpada deseja alterar?");
            System.out.println("1 - Lampada Fluorescente");
            System.out.println("2 - Lampada Incandescente");
            opcLampada = sc.nextInt();
            switch (opcLampada){
                case 1:
                    System.out.flush();
                    System.out.println("Lampada Fluorescente:");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Desligar");
                    opcStatus = sc.nextInt();
                    switch (opcStatus){
                        case 1:
                            LampadaFluorescente.ValidaStatusLampada(true);
                            System.out.println(LampadaFluorescente.RetornaStatusLampada());
                            break;

                        case 2:
                            LampadaFluorescente.ValidaStatusLampada(false);
                            System.out.println(LampadaFluorescente.RetornaStatusLampada());
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Lampada Incandescente:");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Desligar");
                    opcStatus = sc.nextInt();
                    switch (opcStatus){
                        case 1:
                            LampadaIncandescente.ValidaStatusLampada(true);
                            System.out.println(LampadaIncandescente.RetornaStatusLampada());
                            break;

                        case 2:
                            LampadaIncandescente.ValidaStatusLampada(false);
                            System.out.println(LampadaIncandescente.RetornaStatusLampada());
                            break;
                    }
                    break;
            }

            System.out.println("\nStatus atual das lâmpadas: ");
            System.out.println(LampadaFluorescente.StatusAtual());
            System.out.println(LampadaIncandescente.StatusAtual());

            System.out.println("\nRealizar nova ação?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            opcContinuar = sc.nextInt();
            switch (opcContinuar){
                case 1:
                    continuar = true;
                    break;
                case 2:
                    continuar = false;
                    break;
            }
        }while(continuar);
    }
}
