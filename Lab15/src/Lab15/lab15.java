package Lab15;
import java.util.Scanner;
public class lab15 {

	public static void main(String[] args) {
		// 5 basamaklı sayının rakamlarının tersten yazımı
		Scanner input = new Scanner(System.in);
		int number;
		int birler;
		int onlar;
		int yuzler;
		int binler;
		int onbinler;
		
		System.out.print("5 Basamaklı Sayı Giriniz: ");
		number = input.nextInt();
		
		birler = number %10;
		number = number /10;
		onlar = number %10;
		number = number /10;
		yuzler = number %10;
		number = number /10;
		binler = number %10;
		number = number /10;
		onbinler = number %10;
		
		System.out.printf("%d%d%d%d%d ",birler,onlar,yuzler,binler,onbinler);

	}

}
