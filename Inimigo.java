import java.util.Random;
public class Inimigo {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Inimigo(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano!");
    }

public void atacar(Jogador jogador) {
    Random rand = new Random();

    int variacao = rand.nextInt(5);
    int dano = (this.ataque + variacao) - jogador.getDefesa();

    if (dano > 0) {
        jogador.receberDano(dano);
        System.out.println(nome + " atacou " + jogador.getNome() + " e causou " + dano + " de dano!");
    } else {
        System.out.println(nome + " não conseguiu causar dano!");
    }
}
}