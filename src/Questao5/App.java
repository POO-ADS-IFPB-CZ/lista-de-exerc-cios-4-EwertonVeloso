package Questao5;

public class App {
    public static void main(String[] args){
        Personagem personagem = new Guerreiro();
        personagem.atacar();

        personagem = new Arqueiro();
        personagem.atacar();

        personagem = new Mago();
        personagem.atacar();
    }
}
