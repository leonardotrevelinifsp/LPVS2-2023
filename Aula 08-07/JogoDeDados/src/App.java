import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        
        boolean jogarNovamente = true;
        
        while (jogarNovamente) {
            int dado1 = random.nextInt(6) + 1; // Números de 1 a 6
            int dado2 = random.nextInt(6) + 1;
            int somaDados = dado1 + dado2;
            System.out.println("Number1 = " + dado1 + " Number2 = " + dado2 + " Soma = " + somaDados);
            int tentativas = 3;
            int estimativa;
            boolean acertou = false;
            int resposta;
            
            System.out.println("Bem-vindo ao Jogo de Dados!");
            System.out.println("Dois dados foram lançados. Tente adivinhar a soma.");
            
            while (tentativas > 0) {
                System.out.println("Tentativas restantes: " + tentativas);

                estimativa = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite sua estimativa: ")
                );
                
                if (estimativa == somaDados) {
                    acertou = true;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Estimativa incorreta. Tente novamente.");
                    tentativas--;
                }
            }
            
            if (acertou) {
                System.out.println("Parabéns! Você acertou a soma dos dados (" + somaDados + ").");
            } else {
                System.out.println("Suas tentativas acabaram. A soma dos dados era: " + somaDados);
            }
            
            resposta = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?");

            if (resposta != 0) {
                jogarNovamente = false;
                System.out.println("Obrigado por jogar! Até a próxima.");
            }
        }
    }
}