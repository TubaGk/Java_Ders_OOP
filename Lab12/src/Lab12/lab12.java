package Lab12;
import java.util.Scanner;
public class lab12 {

	public static void main(String[] args) {
		//5 basamaklı sayının basamakları
		Scanner input = new Scanner(System.in);
		int number;
		int birler;
		int onlar;
		int yuzler;
		int binler;
		int onbinler;
		
		System.out.print("5 basamaklı sayıyı giriniz :");
		number = input.nextInt();
		
		birler = number %10;
		number = number /10;
		onlar = number %10;
		number = number/10;
		yuzler = number %10;
		number = number /10;
		binler = number %10;
		number = number /10;
		onbinler = number %10;
		
		System.out.printf("Birler : %d%n",birler);
		System.out.printf("Onlar : %d%n",onlar);
		System.out.printf("Yüzler : %d%n",yuzler);
		System.out.printf("Binler : %d%n",binler);
		System.out.printf("Onbinler : %d%n",onbinler);


	}

}
