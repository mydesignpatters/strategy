package app;

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
        return valorDiaria * Math.ceil(tempo);
    }
    
}