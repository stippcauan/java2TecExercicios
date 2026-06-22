import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        double valorCompra = scanner.nextDouble();

        if(valorCompra >= 200){
            Double valorDescontado = valorCompra *0.8;
            System.out.println("O valor da sua compra ficou R$ " + valorDescontado);
        } else if(valorCompra)
    }
}
