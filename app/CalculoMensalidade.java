package app;

public class CalculoMensalidade implements CalculoValor{
    private Double valorMensalidade;

    public CalculoMensalidade(Double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    @Override
    public Double calcular(long tempo, Veiculo veiculo) {
        return valorMensalidade * tempo * 30;
    }
    
}