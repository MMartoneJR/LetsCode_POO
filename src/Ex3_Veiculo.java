public class Ex3_Veiculo {

    String modelo;
    String marca;
    int ano;
    int velocidade;
    int acelerar;
    int velocidadeMax;
    String cor;
    double fipe;

    void caracteristicas(){
        System.out.println("Marca do veículo: "+marca);
        System.out.println("Modelo do veículo: "+modelo);
        System.out.println("Ano do veiculo: ");
    }

    void acelerar(int acelerar){
        if((velocidade + acelerar)>velocidadeMax){
            System.out.println("Velocidade acima do valor permitido para o veículo");
        }
        else{
            System.out.println("Estou acelerando!");
            for (int i = velocidade;i<(velocidade+acelerar);i+=10){
                System.out.println("Velocidade atual: "+i+"km/h");
            }
            velocidade +=acelerar;
        }
    }

    void freiar(){
        System.out.println("Freiando o carro!");
        for (int i = velocidade; i>=0; i-=10){
            System.out.println("Velocidade atual: "+i+"km/h");
        }
        velocidade = 0;
    }
}
