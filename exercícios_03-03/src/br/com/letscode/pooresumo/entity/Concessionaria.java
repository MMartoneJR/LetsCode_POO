package br.com.letscode.pooresumo.entity;

public class Concessionaria {

    private Carro[] carros;
    private Moto[] motos;

    public Concessionaria(Carro[] carros, Moto[] motos) {
        this.carros = carros;
        this.motos = motos;
    }

    public Carro[] getCarros() {
        return carros;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }

    public Moto[] getMotos() {
        return motos;
    }

    public void setMotos(Moto[] motos) {
        this.motos = motos;
    }

    public void imprimeCarros(){
        for(int i = 0 ; i<this.carros.length; i++){
            System.out.println(carros[i].toString());
        }
    }
    public void imprimeMotos(){
        for(int i = 0 ; i<this.motos.length; i++){
            System.out.println(motos[i].toString());
        }
    }
}
