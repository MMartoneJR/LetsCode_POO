import java.util.Scanner;

public class Ex2_Main {
    public static void main(String[] args) {

        Ex2_Livro livro = new Ex2_Livro();
        Scanner sc = new Scanner(System.in);

        System.out.println("Controle de leitura");
        System.out.print("Digite seu nome: ");
        livro.nomeLeitor = sc.nextLine();
        System.out.print("Digite o título do livro: ");
        livro.titulo = sc.nextLine();
        System.out.print("Digite o total de páginas do livro: ");
        livro.qtdPaginas = sc.nextInt();
        System.out.print("Digite o total de páginas lidas até o momento: ");
        livro.paginasLidas = sc.nextInt();

        livro.progressoLeitura();


    }




}
