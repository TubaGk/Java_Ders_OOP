package Lab13;
import java.util.Scanner;
public class lab13 {

	public static void main(String[] args) {
		// bmi birim sistemi
		Scanner input = new Scanner(System.in);
		int kilo;
		int boy;
		float bmi;
		
		System.out.printf("Kilonuzu Giriniz: ");
		kilo = input.nextInt();
		System.out.printf("Boyunuzu Giriniz: ");
		boy = input.nextInt();
		
		bmi = kilo / ((boy * boy)/10000);
		
		if (bmi < 18.5)
			System.out.printf("Zayıf");
		if (18.5 < bmi && bmi <= 24.9)
			System.out.printf("Normal");
		if (24.9 < bmi  && bmi <= 29.9)
			System.out.printf("Şişman");
		if (29.9 < bmi)
			System.out.printf("Obez");
		

	}

}
