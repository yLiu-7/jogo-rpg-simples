public class Jogador {
    private String nome;
    private int vida;
    private int nivel;
    private int ataque;
    private int defesa;

    public Jogador(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.nivel = 1;
        this.ataque = 10;
        this.defesa = 5;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    public int getDefesa() {
        return defesa;
    }

    public void atacar(Inimigo inimigo) {
        int dano = this.ataque - inimigo.getDefesa();
        if (dano > 0) {
            inimigo.receberDano(dano);
            System.out.println(nome + " atacou " + inimigo.getNome() + " e causou " + dano + " de dano!");
        } else {
            System.out.println(nome + " não conseguiu causar dano a " + inimigo.getNome());
        }
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano!");
    }

    public void evoluir() {
        nivel++;
        ataque += 5;
        defesa += 2;
        vida += 20;
        System.out.println(nome + " evoluiu para o nível " + nivel + "!");
    }
}

    