public class Jogo {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Herói");
        Inimigo inimigo = new Inimigo("Goblin", 50, 12, 3);

        System.out.println("Bem-vindo ao jogo, " + jogador.getNome() + "!");

        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
            System.out.println("\n--- Turno de " + jogador.getNome() + " ---");
            jogador.atacar(inimigo);

            if (inimigo.getVida() > 0) {
                System.out.println("\n--- Turno do " + inimigo.getNome() + " ---");
                inimigo.atacar(jogador);
            }
        }

        if (jogador.getVida() <= 0) {
            System.out.println(jogador.getNome() + " perdeu a batalha...");
        } else {
            System.out.println(jogador.getNome() + " venceu " + inimigo.getNome() + "!");
            jogador.evoluir();
        }
    }
}