package Ders4;

public class ders41 {

	public static void main(String[] args) {
		// 
		int [] array =new int[10];
		System.out.printf("%2s %8s %n","index","value");
		
		for (int counter =0; counter < array.length;counter++) {
			array[counter] = 1+counter;
			System.out.printf("%5d %8d %n",counter,array[counter]);
		}

	}

}
