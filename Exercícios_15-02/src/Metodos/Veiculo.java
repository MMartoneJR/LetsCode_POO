package Metodos;

public class Veiculo {

    public String modelo;
    public String marca;
    public int ano;
    public int velocidade;
    public int acelerar;
    public int velocidadeMax;
    public String cor;
    public double fipe;

    public void caracteristicas(){
        System.out.println("Marca do veículo: "+this.marca);
        System.out.println("Modelo do veículo: "+this.modelo);
        System.out.println("Ano do veiculo: ");
    }

    public void acelerar(int acelerar){
        if((this.velocidade + acelerar)>this.velocidadeMax){
            System.out.println("Velocidade acima do valor permitido para o veículo");
        }
        else{
            System.out.println("Estou acelerando!");
            for (int i = this.velocidade;i<(this.velocidade+acelerar);i+=10){
                System.out.println("Velocidade atual: "+i+"km/h");
            }
            this.velocidade +=acelerar;
        }
    }

    public void freiar(){
        System.out.println("Freiando o carro!");
        for (int i = this.velocidade; i>=0; i-=10){
            System.out.println("Velocidade atual: "+i+"km/h");
        }
        this.velocidade = 0;
    }
}
