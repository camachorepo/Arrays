import java.util.Scanner;

public class SearchArray {
	public static void main (String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int[] value = {10,14,13,45,65,456,98,340,23949,1};
		int search =0;
		boolean found = false; 
		
		System.out.println("Hi here are the values in my array");
		for (int i=0; i< value.length; i++) {
			
			System.out.print(value[i] + ", ");
			}
		
		System.out.println("Please enter a value you like to search in array:");
		search = reader.nextInt(); 
		
		for (int j=0; j< value.length; j++) {
			
				if (value[j] == search) {
					found = true;
					System.out.println("Found value at position "+ j);
					break;
				}
			}
		if (!found) System.out.println("Value not found please try again!");
		
	}

}
