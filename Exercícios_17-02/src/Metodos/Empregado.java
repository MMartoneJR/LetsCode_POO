package Metodos;

public class Empregado extends Pessoa {

    int codigoSetor;
    double salarioBase;
    double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);

        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }


    public int codigoSetor(){
        return codigoSetor;
    }

    public double salarioBase(){
        return salarioBase;
    }

    public double imposto(){
        return imposto;
    }

    public double salarioliquido(){
        return (salarioBase - ((imposto/100)*salarioBase));
    }


    public void fichaCompleta(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Código do setor: "+codigoSetor());
        System.out.println("Salário bruto: R$"+salarioBase());
        System.out.println("imposto sobre o salario: "+imposto()+"%");
        System.out.println("Salário líquido: R$"+salarioliquido());

    }
}
