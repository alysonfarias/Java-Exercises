package atvd6estruturadedados1;

import java.util.Scanner;
import java.util.Stack;

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
