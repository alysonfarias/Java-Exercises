package recursao1;

public class Recursao1 {
    // recursao potencia
    public static void main(String[] args) {
        System.out.println(potenciaRecursiva(2, 10));
    }
    
    public static int potenciaRecursiva(int base, int expoente){
        if (expoente == 0) {
            return 1;
        }
        return (base * potenciaRecursiva(base, expoente-1));
    }
}
