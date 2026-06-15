import java.util.Scanner; 

public class Exercicio3 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua velocidade: ");
        double velocidade = scanner.nextDouble();
        
        if (velocidade <= 80.0) {
            System.out.println("Boa viagem!");
        } else {

            System.out.println("Você foi multado!");
        }

        scanner.close();
    }
}