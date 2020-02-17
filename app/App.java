package app;

public class App {

    static ContaEstacionamento meuEstacionamento = new ContaEstacionamento();

    public static void main(String[] args) throws Exception {
        CalculoMensalidade calculo;
        Veiculo veiculo;        
        Double valor = 20.00;

        veiculo = new Veiculo("OVX6841");
        calculo = new CalculoMensalidade(valor);
                
        meuEstacionamento.setVeiculo(veiculo);
        meuEstacionamento.setPeriodo(10, 12);
        meuEstacionamento.setCalculo(calculo);        

        System.out.println("O valor da conta é do veiculo " + veiculo.getPlaca() + ": " + meuEstacionamento.valorConta());
    }
}