package br.com.letscode.pooresumo.entity;

import br.com.letscode.pooresumo.enums.TipoCombustaoEnum;
import br.com.letscode.pooresumo.interfaces.IOrcamento;

import java.math.BigDecimal;

public class Carro extends Veiculo implements IOrcamento {

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

    @Override
    public BigDecimal realizaOrcamento(){
        final BigDecimal ORCAMENTO_CARRO_ALCOOL = BigDecimal.valueOf(2500,1); //250.0
        final BigDecimal ORCAMENTO_CARRO_GASOLINA = BigDecimal.valueOf(5000,1); //500.0
        final BigDecimal ORCAMENTO_CARRO_FLEX = BigDecimal.valueOf(6250,1); //625.1

        if (this.tipoCombustaoEnum.equals(TipoCombustaoEnum.ALCOOL.getDescricao())){
            return ORCAMENTO_CARRO_ALCOOL;
        }
        else if (this.tipoCombustaoEnum.equals(TipoCombustaoEnum.GASOLINA.getDescricao())){
            return ORCAMENTO_CARRO_GASOLINA;
        }
        return ORCAMENTO_CARRO_FLEX;
    }
}
