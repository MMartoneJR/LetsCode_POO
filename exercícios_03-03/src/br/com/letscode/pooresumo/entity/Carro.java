package br.com.letscode.pooresumo.entity;

public class Carro extends Veiculo{

    private int quantidadePortas;
    private boolean hasAirbag;

    public Carro(String fabricante, String modelo, int ano, String tipoCombustaoEnum, double preco, int quantidadePortas, boolean hasAirbag) {
        super(fabricante, modelo, ano, tipoCombustaoEnum, preco);
        this.quantidadePortas = quantidadePortas;
        this.hasAirbag = hasAirbag;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public boolean hasAirbag() {
        return hasAirbag;
    }

    public void setHasAirbag(boolean hasAirbag) {
        this.hasAirbag = hasAirbag;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "quantidadePortas=" + quantidadePortas +
                ", hasAirbag=" + hasAirbag +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", tipoCombustaoEnum='" + tipoCombustaoEnum + '\'' +
                ", preco=" + preco +
                '}';
    }
}
