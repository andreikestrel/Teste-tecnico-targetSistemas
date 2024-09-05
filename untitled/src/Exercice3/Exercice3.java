package Exercice3;

// 3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1;
// enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
//
//Ao final do processamento, qual será o valor da variável SOMA?
public class Exercice3 {
    public static void main(String[] args) {
        int k = 1, indice = 12, soma = 0;

        while (k<indice){
            k++;
            soma = soma + k;
            System.out.println(soma);
        }

    }
}