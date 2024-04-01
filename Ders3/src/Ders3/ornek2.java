package Ders3;
import java.util.Scanner;
public class ornek2 {

	public static void main(String[] args) {
		//(değişiklik yaptıktan sonra)bir kere çalışıyor sadece!!ctrl+z ile çıkış yapılıyor
		int total = 0;
		int gradeCounter = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int grade = input.nextInt();
			total += grade;
			++gradeCounter;
			
			switch (grade/10) {
			case 9:
			case 10:
				++aCount;
				break;
			case 8:
				++bCount;
				break;
			case 7:
				++cCount;
				break;
			case 6:
				++dCount;
				break;
			default:
				++fCount;
				break;
			}
		}
		System.out.println("Grade Report: ");
		System.out.println("A:"+aCount);
		System.out.println("B:"+bCount);
		System.out.println("C:"+cCount);
		System.out.println("D:"+dCount);
		System.out.println("F:"+fCount);

	}

}
