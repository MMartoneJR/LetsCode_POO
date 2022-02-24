package Metodos;

public class Empregado extends Pessoa {

    int codigoSetor;
    double salarioBase;
    double imposto;
    double bonusSalarial;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);

        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(){

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

    public double calcularSalario(){
        switch (codigoSetor){
            case 1:
                bonusSalarial = (0.05*salarioBase);
                break;
            case 2:
                bonusSalarial = (0.10*salarioBase);
                break;
            case 3:
                bonusSalarial = (0.20*salarioBase);
                break;
            default:
                bonusSalarial = 0;

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
        System.out.println("Código do setor: "+codigoSetor);
        if (calcularSalario() == 0){
            System.out.println("Não elegível a bonificação");
        }
        else{
            System.out.println("Bonus salarial: "+calcularSalario());
        }
        System.out.println("Salário bruto: R$"+salarioBase);
        System.out.println("imposto sobre o salario: "+imposto()+"%");
        System.out.println("Salário líquido: R$"+salarioliquido());

    }

    //@Override
    public String toString(){
        return "Nome: " + getNome() + '\''+
                "\nEndereço: " + getEndereco() +'\''+
                "\nTelefone: " + getTelefone() +'\''+
                "\nCódigo do setor: "+codigoSetor +'\''+
                "\nSalário bruto: R$"+salarioBase +'\''+
                //"\nBonus salarial: R$"+calcularSalario()+'\''+
                "\nBonus salarial: R$"+calcularSalario()+'\''+
                "\nimposto sobre o salario: "+imposto()+"%" +'\''+
                "\nSalário líquido: R$"+salarioliquido()
                ;

    }
}
