package br.com.letscode.pooresumo;

import br.com.letscode.pooresumo.entity.Carro;
import br.com.letscode.pooresumo.entity.Concessionaria;
import br.com.letscode.pooresumo.entity.Moto;
import br.com.letscode.pooresumo.enums.TipoCombustaoEnum;

import java.util.concurrent.ConcurrentSkipListSet;

public class POOResumoApplication {

    public static void main(String[] args) {



        Carro carro1 = new Carro("Subaru", "Impreza",2018,
                TipoCombustaoEnum.GASOLINA.getDescricao(), 200000, 4, true);
        Carro carro2 = new Carro("Mitsubishi", "EvoX", 2013,
                TipoCombustaoEnum.GASOLINA.getDescricao(), 120000, 4, true);
        Carro carro3 = new Carro("Chevrolet", "Chevette", 1974,
                TipoCombustaoEnum.ALCOOL.getDescricao(), 10000, 2, false);
        Moto moto1 = new Moto("Honda", "Biz", 2012,
                TipoCombustaoEnum.GASOLINA.getDescricao(), 12000, 125);
        Moto moto2 = new Moto("Honda", "CG", 2018,
                TipoCombustaoEnum.FLEX.getDescricao(), 15000, 250);
        Moto moto3 = new Moto("Honda", "Bizetrica", 2022,
                TipoCombustaoEnum.ELETRICO.getDescricao(), 22000, 150);

        Carro carroCompra = new Carro("Subaru", "Impreza",2018,
                TipoCombustaoEnum.GASOLINA.getDescricao(), 200000, 4, true);

        Carro[] carros = new Carro[]{carro1, carro2, carro3};
        Moto[] motos = new Moto[]{moto1, moto2, moto3};

        Concessionaria concessionaria = new Concessionaria(carros, motos);

        concessionaria.imprimeCarros();
        concessionaria.imprimeMotos();

    }
}
