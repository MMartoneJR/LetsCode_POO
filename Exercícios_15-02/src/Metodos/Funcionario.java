package Metodos;

public class Funcionario {

    public String nome;
    public String sobrenome;
    public String cidade;
    public String estado;
    public int horasTrab;
    public double valorHora;

    public Funcionario(String nome, String sobrenome, String cidade, String estado, int horasTrab, double valorHora){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cidade = cidade;
        this.estado = estado;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;

    }

    public void printNome(String nomeCompleto){
        System.out.println("Nome completo: "+ this.nome +" "+this.sobrenome);
    }

    public void adicionarHoras(int horas){
        this.horasTrab += horas;
        System.out.println("Total de horas: "+this.horasTrab);
    }

    public void novoValorHora(double novoValorHora){
        this.valorHora = novoValorHora;
        System.out.println("Novo valor por hora: R$"+ this.valorHora);
    }

    public void salarioMes(){
        System.out.println("Total a receber: R$"+ (this.horasTrab*this.valorHora));
    }

    public void fichaCompleta(){
        System.out.println("Dados cadastrados:");
        System.out.println("Nome completo: "+this.nome+" "+this.sobrenome);
        System.out.println("Cidade / estado: "+this.cidade+" / "+this.estado);
        System.out.println("Horas trabalhadas: "+this.horasTrab);
        System.out.println("Valor por hora: R$"+this.valorHora);
        this.salarioMes();
    }
}
