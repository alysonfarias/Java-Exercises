package atvd6estruturadedados1;

import java.util.Scanner;
import java.util.Stack;
/*Implemente um programa para converter um número, fornecido pelo
usuário, da notação decimal para um número expresso em um sistema de numeração
cuja base é o 2. A conversão é realizada pela divisão repetida, pela base, à qual o
número está sendo convertido, e então se tomando os restos da divisão na ordem
inversa. Por exemplo, a conversão para binário do número 6 exige três de tais divisões:
6/2 = 3 com resto 0, 3/2 = 1, com resto 1 e, finalmente, 1/2 = 0 com resto 1. Os restos 0,
1 e 1 são colocados na ordem inversa, de modo que o binário equivalente a 6 é igual a
110.
*/

public class Atvd6EstruturaDeDados1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int num;
        String numBinario;

        while (true) {
            System.out.println("Digite seu numero inteiro a ser convertido para binario");
            num = sc.nextInt();
            sc.nextLine();
            numBinario = converteIntParaBin(num);
            System.out.println("Base decimal: "+num+ " | Base binaria: "+numBinario);
        }
    }
    public static String converteIntParaBin(int nume) {
        Stack pilha = new Stack();
        String pilhaValor = "";
        int resto = 0;
        while (nume != 0) {
            resto = nume % 2;
            pilha.push(resto);
            nume = nume / 2;
        }
        while (!pilha.isEmpty()) {
            pilhaValor += Integer.toString((int) pilha.pop());
        }
        return pilhaValor;
    }

}
