package Ders3;

public class ornek1 {

	public static void main(String[] args) {
		// faizli para bulma
		double p =1000;
		double b;
		double r = 0.05;
		double a;
		for(int n=1; n<=10; n++) {
			b = Math.pow(1+r, n);
			a = p * b;
			System.out.println(n+". yıl: "+ a);
		}
		

	}

}
