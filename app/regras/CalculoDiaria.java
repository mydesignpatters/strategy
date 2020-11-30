package app.regras;

import app.entidades.Carga;
import app.entidades.Moto;
import app.entidades.Passeio;
import app.entidades.Veiculo;

public class CalculoDiaria implements CalculoValor{
    private Double valorDiaria;

    /**
     * Valor da diaria do estacionamento;
     */
    public CalculoDiaria(Double valor){
        this.valorDiaria = valor;
    }

    @Override
    public Double calcular(long tempo, Veiculo veiculo) {    
        long taxa = 1;

        if (veiculo instanceof Moto) taxa = 2;
        if (veiculo instanceof Passeio) taxa = 3; 
        if (veiculo instanceof Carga) taxa = 4;

        return valorDiaria * Math.ceil(tempo) * taxa;
    }
    
}