package Metodos;

public class Fornecedor extends Pessoa{

    private double valorCredito;
    private  double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;

    }


    public double getValorCredito(){
        return this.valorCredito;
    }

    public double getValorDivida(){
        return this.valorDivida;
    }

    public double setValorCredito(){
        return this.valorCredito;
    }

    public double setValorDivida(){
        return this.valorDivida;
    }

    public double ObterSaldo(){
        double saldo = this.valorCredito - this.valorDivida;
        return saldo;
    }
    public void fichaCompleta(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Valor de credito: "+getValorCredito());
        System.out.println("Valor da dívida: "+getValorDivida());
        System.out.println("Saldo disponível após quitação de dívida: "+ObterSaldo());

    }

}
