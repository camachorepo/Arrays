
public class Copy {
	public static void main(String[] args) {
		
		int[] value = {10,14,13,45,65,456,98,340,23949,1};
		int [] copy= java.util.Arrays.copyOfRange(value, 0, value.length);

		
		for(int i=0; i<10;i++) {
			
			System.out.println("Array "+ i + ":" + value[i]);
			System.out.println("copy "+ i +":" + copy[i]);
			
		}
		
		
	}



}
