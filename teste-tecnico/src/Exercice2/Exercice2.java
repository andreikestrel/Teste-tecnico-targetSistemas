package Exercice2;
import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        System.out.print("Digite uma letra: ");
        String letraInput = scanner.nextLine();

        if (letraInput.length() != 1) {
            System.out.println("Por favor, digite apenas UMA letra.");
        } else {
            char letra = letraInput.charAt(0);
            ContaLetra.contarLetra(texto, letra);
        }
        scanner.close();
    }
}
