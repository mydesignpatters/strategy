package app.entidades;

public class Passeio extends Veiculo{
    public Passeio(String placa){
        super(placa);
    }

    private int passageiros; 

    public int getPassageiros(){
        return this.passageiros;
    }

    public void setPassageiros(int passageiros){
        this.passageiros = passageiros;
    }
}
