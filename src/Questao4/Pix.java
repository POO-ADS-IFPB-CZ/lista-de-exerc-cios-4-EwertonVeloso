package Questao4;

public class Pix extends Pagamento{
    private double desconto = 0.1;

    @Override
    public void processar(double valor) {
        System.out.println("Pagamento via pix com desconto de 10% no valor de: " + (valor - (valor * desconto)));
    }
}
