package uri01;

import java.util.Scanner;

public class URI01 {
//CIFRA DE CESSAR

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ascii;
        char x, y;
        int chave;
        System.out.println("Digite a mensagem: ");
        String mens = sc.nextLine();
        
        for (int j = 0; j < mens.length(); j++) {
            //tratando caso o usuario digite qualquer coisa alem de letras
            if (mens.charAt(j) < 65 || mens.charAt(j) > 122 || mens.charAt(j) > 90 && mens.charAt(j) < 97) {
                System.err.println("A mensagem que deseja enviar deve conter apenas letras do alfabeto");
                System.exit(0);
            }
        }
        do {
            //chave será um número que deslocará a mensagem pela sua quantidade (msg 'a' e chave = 3, cifra= 'c')
            System.out.println("Digite a CHAVE 0-26 : ");
            chave = sc.nextInt();
        } while (chave < 0 && chave > 26);


        for (int i = 0; i < mens.length(); i++) {
              //Tratamento Letras minusculas      
            if (mens.charAt(i) >= 97 && mens.charAt(i) <= 122) {//letrans minusculas de acordo com a tabela ASCII
                if ((int) (mens.charAt(i) + chave) > 122) {
                    x = (char) ((mens.charAt(i) + chave) - 122);
                    ascii = (char) (96 + x);
                    System.out.print(ascii + " ");
                } else {
                    ascii = (char) (mens.charAt(i) + chave);
                    System.out.print(ascii + " ");

                }

                //Tratamento Letras mausculas
            }
            if (mens.charAt(i) >= 65 && mens.charAt(i) <= 90) {
                if (mens.charAt(i) + chave > 90) {
                    x = (char) ((mens.charAt(i) + chave)-90);
                    ascii = (char) (64 + x);
                    System.out.print(ascii + " ");
                } else {
                    ascii = (char) (mens.charAt(i) + chave);
                    System.out.print(ascii + " ");
                }
            }

        }
    }
}
