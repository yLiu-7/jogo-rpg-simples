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
        int dano = this.ataque - jogador.getDefesa();
        if (dano > 0) {
            jogador.receberDano(dano);
            System.out.println(nome + " atacou " + jogador.getNome() + " e causou " + dano + " de dano!");
        } else {
            System.out.println(nome + " não conseguiu causar dano a " + jogador.getNome());
        }
    }
}