package Questao5;

public class Mago extends Personagem{
    private int dano = 8;
    @Override
    public void atacar() {
        System.out.println("Ataque efetivo! causou "+ dano +" de dano.");
    }
}
