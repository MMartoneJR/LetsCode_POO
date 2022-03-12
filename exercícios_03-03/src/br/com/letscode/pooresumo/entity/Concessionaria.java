package br.com.letscode.pooresumo.entity;

import br.com.letscode.pooresumo.enums.TipoCombustaoEnum;
import br.com.letscode.pooresumo.interfaces.IOrcamento;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Concessionaria{

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
            //System.out.println(carros[i].toString());
            try{
                System.out.println(carros[55].toString());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: " + e.getMessage());
            }finally {
                System.out.println("Finaly");
            }
        }
    }
    public void imprimeMotos(){
        for(int i = 0 ; i<this.motos.length; i++){
            System.out.println(motos[i].toString());
        }
    }

    public String compraCarro(Carro carroCompra){
        Carro[] listaCarrosAtualizada = new Carro[this.getCarros().length + 1];

        for (int i = 0 ; i < this.getCarros().length ; i++){
            listaCarrosAtualizada[i] = this.getCarros()[i];
        }

        listaCarrosAtualizada[this.getCarros().length] = carroCompra;
        return"carro comprado";
    }

    public void geraRelatorio(){
        try(PrintWriter writer =
                    new PrintWriter("log-letscode.txt", "UTF-8")){
            writer.println("Data de referência: "+ LocalDateTime.now() + " - " +
                    "Total de carros: "+);

        }
        catch (){
    }


}
