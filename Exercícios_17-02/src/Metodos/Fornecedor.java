package Metodos;

public class Fornecedor extends Pessoa{

    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(){

    }


    public double valorCredito(){
        return valorCredito;
    }

    public double valorDivida(){
        return valorDivida;
    }

    public double ObterSaldo(){
        return valorCredito - valorDivida;
    }
    public void fichaCompleta(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Valor de credito: R$"+valorCredito());
        System.out.println("Valor da dívida: R$"+valorDivida());
        System.out.println("Saldo disponível após quitação de dívida: R$"+ObterSaldo());

    }

}
