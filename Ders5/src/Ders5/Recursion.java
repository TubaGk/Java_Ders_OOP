package Ders5;

public class Recursion {

	public static void main(String[] args) {
		int sonuc = sum(7);
		System.out.println("Sonuc: "+sonuc);

	}
	//ozyinlemeli fonksiyon
	public static int sum(int k) {
		if(k>0)
			return k+sum(k-1);
		else
			return 0;
	}

}
