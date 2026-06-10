import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        int senhaDigitada = scanner.nextInt();
        int senha = 1234;

        if(senhaDigitada == senha){
        System.out.println("Acesso Permitido");

        } else {
        System.out.println("Acesso Negado");

        }
        
    }
}
