public class Ex2_Livro {

    String titulo;
    String nomeLeitor;
    double qtdPaginas;
    double paginasLidas;

//    Ex2_Livro(String titulo, String nomeLeitor, int qtdPaginas, int paginasLidas){
//        this.titulo = titulo;
//        this.nomeLeitor = nomeLeitor;
//        this.qtdPaginas = qtdPaginas;
//        this.paginasLidas = paginasLidas;
//    }

    void progressoLeitura( ){
        double progressoLeitura = ((paginasLidas/qtdPaginas)*100);
        char percent = '%';
        //System.out.println("Você já leu "+progressoLeitura+"% do livro");
        System.out.printf("Você já leu %.2f%c do livro", progressoLeitura, percent);
    }
}
