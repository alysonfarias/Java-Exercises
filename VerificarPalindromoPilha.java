package atvd5estruturadedados1complemento;

import java.util.Scanner;
import java.util.Stack;

/*
Questão: Implemente um programa para solicitar ao usuário que digite uma frase
(String) e determinar se a frase digitada é um palíndromo ou não, ou seja, se a frase é
soletrada identicamente do início para o fim e do fim para o início. Uma frase válida,
para o programa, só deverá conter letras e espaços. Para decidir se uma frase é
palíndromo, o programa deve ignorar os espaços. Exemplos de palíndromos: “asa”,
“ovo”, “Roma me tem amor, A mala nada na lama’”.
 */

public class Atvd5EstruturaDeDados1Complemento {

    public static void main(String[] args) {
          String str;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite sua frase para ser verificada como palindromo");
            str = sc.nextLine();
            str = tratarString(str);
            boolean isPalindrome = verificarPalindromo(str);
            System.out.println((isPalindrome) ?"[ " + str +" ] é palindromo" : "[" + str +" ] NÃO é um palindromo");
        } while (true);

    }

    public static String tratarString(String str) {
        String novaString = str.replaceAll(" ", "");
        return novaString;
    }
    
    public static boolean verificarPalindromo(String str){
        Stack pilha = new Stack();
        String strInversa = "";
        
        for (int i = 0; i < str.length(); i++) { //   # Empilha a primeira parte (left)
            pilha.push(str.charAt(i));
        }
        while (!pilha.isEmpty()) {
            strInversa += pilha.pop();
            System.out.println(pilha.size()+" restantes na pilha");
        }
        
        return str.equalsIgnoreCase(strInversa);
    }

}
