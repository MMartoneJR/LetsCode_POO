import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        LampadaFluorescente lampadaFluorescente = new LampadaFluorescente();
        LampadaIncandescente lampadaIncandescente = new LampadaIncandescente();
        Lampada lampada = new Lampada();

        lampadaFluorescente.setTipoLampada("fluorescente");
        lampadaIncandescente.setTipoLampada("incandescente");

        boolean continuar = true;
        int opcLampada = 0, opcStatus = 0;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("\nStatus atual das lâmpadas: ");
            System.out.println(lampadaFluorescente.StatusAtual());
            System.out.println(lampadaIncandescente.StatusAtual());
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
                            lampadaFluorescente.ValidaStatusLampada(true);
                            System.out.println(lampadaFluorescente.RetornaStatusLampada());
                            break;

                        case 2:
                            lampadaFluorescente.ValidaStatusLampada(false);
                            System.out.println(lampadaFluorescente.RetornaStatusLampada());
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
                            lampadaIncandescente.ValidaStatusLampada(true);
                            System.out.println(lampadaIncandescente.RetornaStatusLampada());
                            break;

                        case 2:
                            lampadaIncandescente.ValidaStatusLampada(false);
                            System.out.println(lampadaIncandescente.RetornaStatusLampada());
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
                            lampadaIncandescente.ValidaStatusLampada(true);
                            lampadaFluorescente.ValidaStatusLampada(true);
                            System.out.println(lampadaFluorescente.RetornaStatusLampada());
                            System.out.println(lampadaIncandescente.RetornaStatusLampada());
                            break;

                        case 2:
                            lampadaIncandescente.ValidaStatusLampada(false);
                            lampadaFluorescente.ValidaStatusLampada(false);
                            System.out.println(lampadaFluorescente.RetornaStatusLampada());
                            System.out.println(lampadaIncandescente.RetornaStatusLampada());
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
