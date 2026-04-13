 import java.util.Scanner;
 public class Jogo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jogador jogador = new Jogador("Herói");
        Inimigo inimigo = new Inimigo("Goblin", 50, 12, 3);

        System.out.println("=== HISTÓRIA ===");
        System.out.println("Você é um jovem cavaleiro numa floresta sombria...");
        System.out.println("Um Goblin aparece e te ataca!");
        System.out.println("=================\n");
        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {

            System.out.println("\n--- Turno de " + jogador.getNome() + " ---");
            System.out.println("1 - Atacar");
            System.out.println("2 - Defender");
            System.out.println("3 - Fugir");

            int escolha = scanner.nextInt();

                if (escolha == 1) {
                    jogador.atacar(inimigo);
                } else if (escolha == 2) {
                    jogador.defender();
                } else if (escolha == 3) {
                    System.out.println("Você fugiu da batalha!");
                    break;
}

            if (inimigo.getVida() > 0) {
                System.out.println("\n--- Turno do " + inimigo.getNome() + " ---");
                inimigo.atacar(jogador);
            }
        }

        if (jogador.getVida() <= 0) {
            System.out.println("Você foi derrotado...");
        } else if (inimigo.getVida() <= 0) {
            System.out.println("Você venceu o Goblin!");
            jogador.evoluir();
        }

        scanner.close();
    }
}