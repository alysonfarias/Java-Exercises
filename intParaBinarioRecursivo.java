package recursao3;
/*
 Um problema típico em ciência da computação consiste
em converter um número da sua forma decimal para a
forma binária. Use o metodo recursivo para realizar a operação
 */
public class Recursao3 {

    public static void main(String[] args) {
        print_bin(10);
    }

    public static void print_bin(int x) {
        if (x == 0) {
            return;
        }
        print_bin(x / 2);
        System.out.print(x % 2);
    }
}
