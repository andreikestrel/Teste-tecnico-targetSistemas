package Exercice1;
public class Fibonacci {
    private int ultimoNumero;

    public Fibonacci() {
        this.ultimoNumero = 0;
    }

    public boolean pertenceFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        int a = 0, b = 1;
        while (b < num) {
            int x = b;
            b = a + b;
            a = x;
        }
        return b == num;
    }

    public void verificarEExibir(int num) {
        this.ultimoNumero = num;
        if (pertenceFibonacci(num)) {
            System.out.println(num + " pertence a Fibonacci.");
        } else {
            System.out.println(num + " não pertence a Fibonacci.");
        }
    }

    public int getUltimoNumero() {
        return this.ultimoNumero;
    }
}

