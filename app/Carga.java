package app;

public class Carga extends Veiculo{
    public Carga(String placa) {
        super(placa);
    }

    private int peso;

    public int getPeso(){
        return this.peso;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }
}
