package Questao5;

public class Guerreiro extends Personagem{
    private int dano = 12;
    @Override
    public void atacar() {
        System.out.println("Ataque efetivo! causou " + dano + " de dano.");
    }
}
