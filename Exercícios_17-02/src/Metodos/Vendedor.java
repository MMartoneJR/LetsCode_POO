package Metodos;

import Enums.TipoJornadaEmpregado;

public class Vendedor extends Empregado{

    double valorVendas;
    double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao, String tipoJornadaEmpregado) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto, tipoJornadaEmpregado);

        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(){

    }
    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;
    }

    public int getCodigoSetor(){
        return codigoSetor;
    }

    double bonus = calcularSalario();

    public double valorVendas(){
        return valorVendas;
    }

    public double comissao(){
        return comissao;
    }

    public double valorComissao(){
        return ((comissao()/100)*valorVendas());
    }

    public double salarioComComissao(){
        return (salarioBase+valorComissao());
    }

    public double salarioLiquido(){
        return (bonus+salarioComComissao() + (imposto()/100)*salarioComComissao());
    }



    public void fichaCompleta(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Código do setor: "+codigoSetor);
        System.out.println("Salário bruto: R$"+salarioBase);
        if (bonus == 0){
            System.out.println("Não elegível a bonificação");
        }
        else{
            System.out.println("Bonus salarial: "+bonus);
        }
        System.out.println("Total de vendas: R$"+valorVendas());
        System.out.println("Percentual de comissao: "+comissao()+"%");
        System.out.println("Valor da comissao: R$"+valorComissao());
        System.out.println("imposto sobre o salario: "+imposto()+"%");
        System.out.println("Salário líquido: R$"+salarioLiquido());

    }

    //@Override
    public String toString(){
        return "Nome: " + getNome() + '\''+
                "\nEndereço: " + getEndereco() +'\''+
                "\nTelefone: " + getTelefone() +'\''+
                "\nCódigo do setor: "+codigoSetor +'\''+
                "\nSalário bruto: R$"+salarioBase +'\''+
                "\nTotal de vendas: R$"+valorVendas() +'\''+
                "\nPercentual de comissao: "+comissao()+"%" +'\''+
                "\nValor da comissao: R$"+valorComissao() +'\''+
                "\nimposto sobre o salario: "+imposto()+"%" +'\''+
                "\nSalário líquido: R$"+salarioliquido()
                ;

    }
}
