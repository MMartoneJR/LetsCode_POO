package Metodos;

public class Administrador extends Empregado{

    double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);

        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double ajudaDeCusto(){
        return ajudaDeCusto;
    }

    public double salarioComAjuda(){
        return (salarioliquido()+ajudaDeCusto);
    }

    public void fichaCompleta(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Código do setor: "+codigoSetor());
        System.out.println("Salário bruto: R$"+salarioBase());
        System.out.println("Ajuda de custo: R$"+ajudaDeCusto());
        System.out.println("imposto sobre o salario: "+imposto()+"%");
        System.out.println("Salário líquido: R$"+salarioliquido());
        System.out.println("Total a receber: R$"+salarioComAjuda());

    }

}
