package Enums;

public enum TipoJornadaEmpregado {

    PERIODO_COMPLETO("Período Completo"),
    MEIO_PERIODO("Meio Período");

    private String descricao;

    TipoJornadaEmpregado(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
