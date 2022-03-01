import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        LampadaFluorescente LampadaFluorescente = new LampadaFluorescente();
        LampadaIncandescente LampadaIncandescente = new LampadaIncandescente();
        Lampada lampada = new Lampada();

        LampadaFluorescente.setTipoLampada("fluorescente");
        LampadaIncandescente.setTipoLampada("incandescente");

        boolean continuar = true;
        int opcLampada = 0, opcStatus = 0, opcContinuar = 0;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("\nStatus atual das lâmpadas: ");
            System.out.println(LampadaFluorescente.StatusAtual());
            System.out.println(LampadaIncandescente.StatusAtual());
            lampada.menu();
            opcLampada = sc.nextInt();

            while(opcLampada < 0 || opcLampada > 3){
                System.out.println("Opção invalida, escolha novamente:");
                opcLampada = sc.nextInt();
            }

            switch (opcLampada){
                case 1:
                    System.out.flush();
                    System.out.println("Lampada Fluorescente:");
                    lampada.opcoes();
                    opcStatus = sc.nextInt();

                    while(opcStatus < 1 || opcStatus > 2){
                        System.out.println("Opção invalida, escolha novamente:");
                        opcStatus = sc.nextInt();
                    }

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
                    lampada.opcoes();
                    opcStatus = sc.nextInt();

                    while(opcStatus < 1 || opcStatus > 2){
                        System.out.println("Opção invalida, escolha novamente:");
                        opcStatus = sc.nextInt();
                    }

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
                case 3:
                    System.out.println("Ambas:");
                    lampada.opcoes();
                    opcStatus = sc.nextInt();

                    while(opcStatus < 1 || opcStatus > 2){
                        System.out.println("Opção invalida, escolha novamente:");
                        opcStatus = sc.nextInt();
                    }

                    switch (opcStatus){
                        case 1:
                            LampadaIncandescente.ValidaStatusLampada(true);
                            LampadaFluorescente.ValidaStatusLampada(true);
                            System.out.println(LampadaFluorescente.RetornaStatusLampada());
                            System.out.println(LampadaIncandescente.RetornaStatusLampada());
                            break;

                        case 2:
                            LampadaIncandescente.ValidaStatusLampada(false);
                            LampadaFluorescente.ValidaStatusLampada(false);
                            System.out.println(LampadaFluorescente.RetornaStatusLampada());
                            System.out.println(LampadaIncandescente.RetornaStatusLampada());
                            break;
                    }
                    break;
                case 0:
                    continuar = false;
                    break;

            }
        }while(continuar);
    }
}
