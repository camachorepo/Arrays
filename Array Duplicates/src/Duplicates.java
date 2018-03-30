import java.util.Scanner;

public class Duplicates {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int[] value = {1,1,13,45,13,1,98,13,23949,1};
		int search = 0;
		int duplicates=0;
		
		System.out.println("Hi here are the values in my array");
		for (int i=0; i< value.length; i++) {
			
			System.out.print(value[i] + ", ");
			}
		
		System.out.println("Please let me know which value you like to find duplicates for: ");
		search = reader.nextInt();
		
		for(int j=0; j<value.length; j++) {
			
			if(value[j] == search) {
				
				duplicates++;
			}
		}
		System.out.println("Value appeared in array "+ duplicates + " times");
			
	}

}
