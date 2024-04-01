package Lab11;
import java.util.Scanner;
public class anasayfa {

	public static void main(String[] args) {
		// hesap makinesi
		Scanner input = new Scanner(System.in);
		int number1 ;
		int number2 ;
		int toplam ;
		int fark ;
		int carp ;
		float bolme ;
		
		System.out.print("ilk sayıyı giriniz: ");
		number1 = input.nextInt();
		
		System.out.print("ikinci sayıyı giriniz: ");
		number2 = input.nextInt();
		
		toplam = number1 + number2;
		fark = number1 - number2;
		carp = number1 * number2;
		bolme = number1 / number2;
		
		System.out.printf("toplam: %d%n",toplam);
		System.out.printf("fark: %d%n",fark);
		System.out.printf("çarpım: %d%n",carp);
		System.out.printf("bölüm: %.1f",bolme);
		

	}

}
