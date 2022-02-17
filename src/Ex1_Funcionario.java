public class Ex1_Funcionario {

     String nome;
     String sobrenome;
     String cidade;
     String estado;
     int horasTrab;
     double valorHora;

     Ex1_Funcionario(String nome, String sobrenome, String cidade, String estado, int horasTrab, double valorHora){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cidade = cidade;
        this.estado = estado;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;

    }


    void printNome(String nomeCompleto){

        System.out.println("Nome completo: "+ this.nome +" "+this.sobrenome);
    }

    void adicionarHoras(int horas){
        this.horasTrab += horas;
        System.out.println("Total de horas: "+this.horasTrab);
    }

    void novoValorHora(double novoValorHora){
        this.valorHora = novoValorHora;
        System.out.println("Novo valor por hora: R$"+ this.valorHora);
    }

    void salarioMes(){

        System.out.println("Total a receber: R$"+ (this.horasTrab*this.valorHora));
    }

    void fichaCompleta(){
        System.out.println("Dados cadastrados:");
        System.out.println("Nome completo: "+this.nome+" "+this.sobrenome);
        System.out.println("Cidade / estado: "+this.cidade+" / "+this.estado);
        System.out.println("Horas trabalhadas: "+this.horasTrab);
        System.out.println("Valor por hora: R$"+this.valorHora);
        this.salarioMes();
    }


}
