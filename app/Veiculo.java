package app;

public class Veiculo {
    public Veiculo(String placa){
        this.placa = placa;
    }
    
    private String motor;
    private String carroceria;
    private String placa;

    public String getMotor(){
        return this.motor;
    }    

    public String getCarroceria(){
        return this.carroceria;
    }

    public void setMotor(String motor){
        this.motor = motor;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

}
