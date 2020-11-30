package app.regras;

import app.entidades.Veiculo;

public interface CalculoValor {
    public Double calcular(long tempo, Veiculo veiculo);
}
