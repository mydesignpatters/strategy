package app.regras;

import app.entidades.Carga;
import app.entidades.Moto;
import app.entidades.Passeio;
import app.entidades.Veiculo;

public class CalculoMensalidade implements CalculoValor{
    private Double valorMensalidade;

    public CalculoMensalidade(Double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    @Override
    public Double calcular(long dias, Veiculo veiculo) {
        long taxa = 1;

        if (veiculo instanceof Moto) taxa = 2;
        if (veiculo instanceof Passeio) taxa = 3; 
        if (veiculo instanceof Carga) taxa = 4;

        return valorMensalidade * dias * taxa;
    }
    
}