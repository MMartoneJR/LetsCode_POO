package Metodos;

public class Livro {
    public String titulo;
    public String nomeLeitor;
    public double qtdPaginas;
    public double paginasLidas;

//    Ex2_Livro(String titulo, String nomeLeitor, int qtdPaginas, int paginasLidas){
//        this.titulo = titulo;
//        this.nomeLeitor = nomeLeitor;
//        this.qtdPaginas = qtdPaginas;
//        this.paginasLidas = paginasLidas;
//    }

    public void progressoLeitura( ){
        double progressoLeitura = ((paginasLidas/qtdPaginas)*100);
        char percent = '%';
        //System.out.println("Você já leu "+progressoLeitura+"% do livro");
        System.out.printf("Você já leu %.2f%c do livro", progressoLeitura, percent);
    }
}
