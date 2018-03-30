
public class Largest {
	public static void main (String[] args) {
		int[] value = {10,14,13,45,65,456,98,340,23949,1};
		int largest_value=0;
		int position =0;
		System.out.println("Hi here are the values in my array");
		for (int i=0; i< value.length; i++) {
			
			System.out.print(value[i] + ", ");
			}
		
		for(int j =0; j< value.length; j++) {
			
			if(largest_value < value[j]) {
				
				largest_value = value[j];
				position = j;
				
			}
		}
		
		System.out.println("Largest value in array is: " + largest_value + " at position: " + position);
	}

}
