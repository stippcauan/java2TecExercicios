import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        double valorTotal = scanner.nextDouble();

        int porcentagemDesconto = 0;

        if (valorTotal > 200) {
            porcentagemDesconto = 20;
        } else if (valorTotal > 100) {
            porcentagemDesconto = 10;
        } else {
            porcentagemDesconto = 0;
        }


        double valorDesconto = valorTotal * (porcentagemDesconto / 100.0);
        double valorFinal = valorTotal - valorDesconto;

        System.out.println("Desconto aplicado: " + porcentagemDesconto + "%");
    
    }
}        