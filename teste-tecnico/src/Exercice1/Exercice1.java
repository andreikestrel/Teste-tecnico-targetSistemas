package Exercice1;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();

        System.out.println("Insira um número");
        int numero = scanner.nextInt();
        scanner.close();


        fib.verificarEExibir(numero);
    }
}
