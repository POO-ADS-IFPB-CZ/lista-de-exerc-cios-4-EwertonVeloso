package Questao5;

public class Arqueiro extends Personagem{
    private int dano = 6;
    @Override
    public void atacar() {
        System.out.println("Ataque efetivo! causou " + dano + " de dano.");
    }
}
