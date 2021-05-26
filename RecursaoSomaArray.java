
package recursao2;

/* Usando recursividade, calcule a soma de
    todos os valores de um array de reais.
*/
public class Recursao2 {

    public static void main(String[] args) {
        int mult = 1;
        int[] teste = new int[10];

        for (int i = teste.length; i >= 1; i--){
            mult = mult*2;
            teste[i-1] = mult;
            System.out.println(mult);
        }
        
       System.out.println("Soma dos valores no array: "+ somaValoresArray(teste, teste.length));
    }
    
    public static int somaValoresArray(int array[], int tamanho){
        if (tamanho == 0) {
            return 0;
        }
        return array[tamanho-1] + somaValoresArray(array, tamanho-1);
    }
    
    
}
