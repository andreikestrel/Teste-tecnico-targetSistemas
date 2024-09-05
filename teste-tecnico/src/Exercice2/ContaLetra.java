package Exercice2;

public class ContaLetra {
    public static void contarLetra(String str, char letra) {
        int contador = (int) str.toLowerCase().chars().filter(ch -> ch == Character.toLowerCase(letra)).count();

        if (contador == 1) {
            System.out.println("A letra '" + letra + "' aparece uma vez na string.");
        } else if (contador > 1) {
            System.out.println("A letra '" + letra + "' aparece " + contador + " vezes na string.");
        } else {
            System.out.println("Não existe nenhuma letra '" + letra + "' na string.");
        }
    }
}
