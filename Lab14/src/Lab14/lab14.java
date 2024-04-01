package Lab14;
import java.util.Scanner;
public class lab14 {

	public static void main(String[] args) {
		// daire alan cevre
		double PI_SAYISI = 3.14159;
		Scanner input = new Scanner(System.in);
		double cap;
		double cevre;
		double alan;
		
		System.out.print("Çapı Giriniz: ");
		cap = input.nextDouble();
		
		cevre = 2 * PI_SAYISI * cap;
		alan = PI_SAYISI * (cap * cap);
		
		System.out.printf("Çevre: %f %nAlan: %f",cevre,alan);

	}

}
