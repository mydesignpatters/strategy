package app;

import app.entidades.Veiculo;
import app.regras.CalculoValor;

public class ContaEstacionamento {
    private CalculoValor calculo; 
    private Veiculo veiculo; 
    private long inicio, fim;

    /**
     * Atualiza o tipo de calculo que sera usado
     * @param calculo calculo que sera usado na operacao de cobranca do estacionamento
     */
    public void setCalculo(CalculoValor calculo){
        this.calculo = calculo;
    }

    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    public void setPeriodo(long inicio, long fim){
        this.inicio = inicio;
        this.fim = fim;
    }
    /**
     * Retorna o valor que sera cobrado no estacioamento
     * @return valor que sera cobrado
     */
    public Double valorConta(){
        return calculo.calcular(fim-inicio, veiculo);
    }


}