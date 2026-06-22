import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a cor do semáfaro");
            String cor = scanner.nextLine();

            String corMaiscula = cor.toUpperCase();

            if (corMaiscula.equals("VERMELHO")) {
                System.out.println("Pare o carro");

            } else if (corMaiscula.equals("AMARELO")){
                System.out.println("Cuidado");

            } else {
                System.out.println("Siga em Frente");
            }
        }
}