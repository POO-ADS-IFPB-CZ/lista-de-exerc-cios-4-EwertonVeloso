package Questao4;

public class App {
    public static void main (String[] args){
        Pagamento pagamento = new Boleto();
        pagamento.processar(50);

        pagamento = new CartaoCredito();
        pagamento.processar(50);

        pagamento = new Pix();
        pagamento.processar(50);

    }
}
