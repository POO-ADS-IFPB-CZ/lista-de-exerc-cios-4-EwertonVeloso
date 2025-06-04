package Questao4;

public class CartaoCredito extends Pagamento{
    private double taxa = 0.05;

    @Override
    public void processar(double valor) {
        System.out.println("Pagamento via cartão de crédito no valor de " + (valor + (valor * taxa)));
    }
}
