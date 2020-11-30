package app;

import app.entidades.Moto;
import app.entidades.Passeio;
import app.regras.CalculoDiaria;
import app.regras.CalculoMensalidade;

public class App {

    static ContaEstacionamento conta1 = new ContaEstacionamento();
    static ContaEstacionamento conta2 = new ContaEstacionamento();
    static ContaEstacionamento conta3 = new ContaEstacionamento();
    static ContaEstacionamento conta4 = new ContaEstacionamento();

    public static void main(final String[] args) throws Exception {
        CalculoMensalidade calculoMensalidade1;
        CalculoMensalidade calculoMensalidade2;
        CalculoDiaria calculoDiaria1, calculoDiaria2;

        Moto moto1, moto2;
        Passeio carroPasseio1, carroPasseio2;

        Double taxaMensalidade = 20.00;
        Double taxaDiaria = 1.00;

        //Calculo proporcional da mensalidade da moto1
        moto1 = new Moto("ABC1234");
        calculoMensalidade1 = new CalculoMensalidade(taxaMensalidade);
        conta1.setVeiculo(moto1);
        conta1.setPeriodo(1,10);
        conta1.setCalculo(calculoMensalidade1);
        System.out.println("O valor da conta do veiculo " + moto1.getPlaca() + ": " + conta1.valorConta());

        //Calculo proporcional da mensalidade do carro de passeio 1
        carroPasseio1 = new Passeio("ABC4556");
        calculoMensalidade2 = new CalculoMensalidade(taxaMensalidade);
        conta2.setVeiculo(carroPasseio1);
        conta2.setPeriodo(1,10);
        conta2.setCalculo(calculoMensalidade2);
        System.out.println("O valor da conta do veiculo " + carroPasseio1.getPlaca() + ": " + conta2.valorConta());

        //Calculo proporcional de diárias da moto2
        moto2 = new Moto("CCC1234");
        calculoDiaria1 = new CalculoDiaria(taxaDiaria);
        conta3.setVeiculo(moto2);
        conta3.setPeriodo(1, 2);
        conta3.setCalculo(calculoDiaria1);
        System.out.println("O valor da conta do veiculo " + moto2.getPlaca() + " " + conta3.valorConta());

        //Calculo proporcional de diárias do carro de passeio 2
        carroPasseio2 = new Passeio("DDD2244");
        calculoDiaria2 = new CalculoDiaria(taxaDiaria);
        conta4.setVeiculo(carroPasseio2);
        conta4.setPeriodo(1, 2);
        conta4.setCalculo(calculoDiaria2);
        System.out.println("O valor da conta do veiculo " + carroPasseio2.getPlaca() + " " + conta4.valorConta());
    }
}