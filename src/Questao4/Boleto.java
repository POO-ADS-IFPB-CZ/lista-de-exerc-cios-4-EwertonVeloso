package Questao4;

public class Boleto extends Pagamento{
    private double taxa = 0.1;

    @Override
    public void processar(double valor) {
        System.out.println("Pagamento via boleto no valor de: " + (valor + (valor * taxa)));
    }
}
