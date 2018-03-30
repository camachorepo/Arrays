import java.util.Arrays;
import java.util.Scanner;

public class StringInputs {
	
	public static void main (String [] args) {
		String input; 
		
		int comma = 0;
		int element =0;
		int numWords =0;
		Scanner reader = new Scanner(System.in);
		System.out.println("PLease enter a list of words each followed by a comma");
		input= reader.nextLine(); 
		String[] words1 = new String [input.length()];
		for(int i=0; i< input.length(); i++) {
			
			if(input.charAt(i) == ',') {
				numWords ++;
				//Arrays.copyOf(i,i.length);
			}
			
		}
		String[] words = new String [numWords+1];
		for(int i=0; i< input.length(); i++) {
			
			if(input.charAt(i) == ',') {
				words[element++]= input.substring(comma, i);	
				comma = i+1;
				System.out.println(words[element-1]);
			}
			if(i == (input.length()-1)) {
				
				words[element++]= input.substring(comma, i+1);
				System.out.println(words[element-1]);
				
			}
			
		}
		
	}
}