import java.util.Random;

public class Jogador {
    private String nome;
    private int vida;
    private int nivel;
    private int ataque;
    private int defesa;
    private boolean defendendo = false;

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
        Random rand = new Random();

        int variacao = rand.nextInt(5); // 0 a 4
        int dano = (this.ataque + variacao) - inimigo.getDefesa();

        if (dano > 0) {
            inimigo.receberDano(dano);
            System.out.println(nome + " atacou " + inimigo.getNome() + " e causou " + dano + " de dano!");
        } else {
            System.out.println(nome + " não conseguiu causar dano!");
        }
    }

    public void defender() {
        defendendo = true;
        System.out.println(nome + " está se defendendo! (dano reduzido no próximo ataque)");
    }

    public void receberDano(int dano) {
        if (defendendo) {
            dano /= 2; 
            defendendo = false; 
            System.out.println(nome + " defendeu o ataque!");
        }

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