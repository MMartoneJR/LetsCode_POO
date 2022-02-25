package Metodos;

public class Administrador extends Empregado{

    double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto, String tipoJornadaEmpregado) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto, tipoJornadaEmpregado);

        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(){

    }
    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;
    }

    public int getCodigoSetor(){
        return codigoSetor;
    }

    double bonus = calcularSalario();


    public double ajudaDeCusto(){
        return ajudaDeCusto;
    }

    public double salarioComAjuda(){
        return (salarioliquido()+ajudaDeCusto);
    }
    public double salarioLiquido(){
        return (bonus+salarioComAjuda() + (imposto()/100)*salarioComAjuda());
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
        System.out.println("Ajuda de custo: R$"+ajudaDeCusto());
        System.out.println("imposto sobre o salario: "+imposto()+"%");
        System.out.println("Salário líquido: R$"+salarioliquido());
        System.out.println("Total a receber: R$"+salarioComAjuda());

    }

    //@Override
    public String toString(){
        return "Nome: " + getNome() + '\''+
                "\nEndereço: " + getEndereco() +'\''+
                "\nTelefone: " + getTelefone() +'\''+
                "\nCódigo do setor: "+codigoSetor +'\''+
                "\nSalário bruto: R$"+salarioBase +'\''+
                "\nAjuda de custo: R$"+ajudaDeCusto() +'\''+
                "\nimposto sobre o salario: "+imposto()+"%" +'\''+
                "\nSalário líquido: R$"+salarioliquido()+'\''+
                "\nTotal a receber: R$"+salarioComAjuda()
                ;
    }

}
