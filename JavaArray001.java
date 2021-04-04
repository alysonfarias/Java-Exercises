import java.util.Arrays;
public class ArraysExercises {
	public static void main(String[] args) {
	//Write a Java program to sort a numeric array and a string array.
		
			int[] array1 = {
					123,431,645,65332,332,123,213,457665,445,4343
			};
			
			String[] array2 = {
				"Recife",
				"Salvador",
				"Gramado",
				"Rio de Janeiro",
				"Sao Paulo",
				"Ouro Preto"
			};
			System.out.println("Array original: "+ Arrays.toString(array1));
			Arrays.sort(array1);
			System.out.println("Array ordenado: "+ Arrays.toString(array1));
			
			System.out.println("Array original: "+ Arrays.toString(array2));
			Arrays.sort(array2);
			System.out.println("Array ordenado: "+ Arrays.toString(array2));
	}
}
