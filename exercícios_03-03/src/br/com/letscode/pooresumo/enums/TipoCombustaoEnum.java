package br.com.letscode.pooresumo.enums;

public enum TipoCombustaoEnum {
    GASOLINA("Gasolina"),
    ALCOOL("Alcool"),
    FLEX("Flex"),
    ELETRICO("Elétrico");

    private String descricao;

    TipoCombustaoEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
