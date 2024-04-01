package Ders2;
import java.util.Scanner;
public class ders21 {
	public static void main(String[] args) {
		// tek mi çift mi
		Scanner scan = new Scanner(System.in);
		System.out.print("bir sayi gir: ");
	    int num = scan.nextInt();
		findEvenOdd(num);


	}
	public static void findEvenOdd(int num) {
		if (num%2 ==0)
			System.out.print(num +" is even");
		else
			System.out.print(num +" is odd");
	}
}
