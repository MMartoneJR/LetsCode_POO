package Metodos;

import Enums.TipoJornadaEmpregado;

public class Empregado extends Pessoa {

    protected int codigoSetor;
    protected double salarioBase;
    protected double imposto;
    protected double bonusSalarial;
    protected String tipoJornadaEmpregado;
    protected double calcularSalario;
    private final double bonus5 = 0.05d;
    private final double bonus10 = 0.10d;
    private final double bonus20 = 0.20d;


    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, String TipoJornadaEmpregado) {
        super(nome, endereco, telefone);

        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
        this.tipoJornadaEmpregado = TipoJornadaEmpregado;
        this.calcularSalario = calcularSalario;
    }

    public Empregado(){

    }

    public void setTipoJornadaEmpregado(String tipoJornadaEmpregado){
        this.tipoJornadaEmpregado = tipoJornadaEmpregado;
    }

    public String getTipoJornadaEmpregado(){
        return tipoJornadaEmpregado;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void getCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;
    }

    public int getCodigoSetor(){
        return codigoSetor;
    }

    protected double calcularSalario(){
        switch (codigoSetor){
            case 1:
                bonusSalarial = (bonus5*salarioBase);
                break;
            case 2:
                bonusSalarial = (bonus10*salarioBase);
                break;
            case 3:
                bonusSalarial = (bonus20*salarioBase);
                break;
            default:
                bonusSalarial = 0;
                break;
        }
        return bonusSalarial;
    }

    public double imposto(){
        return imposto;
    }

    public double salarioliquido(){
        return ((salarioBase+bonusSalarial) - ((imposto/100)*salarioBase));
    }


    public void fichaCompleta(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Código do setor: "+getCodigoSetor());
        System.out.println("Jornada de trabalho: "+getTipoJornadaEmpregado());
        if (calcularSalario() == 0){
            System.out.println("Não elegível a bonificação");
        }
        else{
            System.out.println("Bonus salarial: "+calcularSalario());
        }
        System.out.println("Salário bruto: R$"+getSalarioBase());
        System.out.println("imposto sobre o salario: "+imposto()+"%");
        System.out.println("Salário líquido: R$"+salarioliquido());

    }

    //@Override
    public String toString(){
        return "Nome: " + getNome() + '\''+
                "\nEndereço: " + getEndereco() +'\''+
                "\nTelefone: " + getTelefone() +'\''+
                "\nCódigo do setor: "+getCodigoSetor() +'\''+
                "\nJornada de trabalho: "+
                "\nSalário bruto: R$"+getSalarioBase() +'\''+
                "\nBonus salarial: R$"+calcularSalario()+'\''+
                "\nimposto sobre o salario: "+imposto()+"%" +'\''+
                "\nSalário líquido: R$"+salarioliquido();
    }
}
