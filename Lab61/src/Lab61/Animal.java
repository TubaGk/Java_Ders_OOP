package Lab61;

public class Animal {
	protected int leg;
	
	Animal(int leg){
		this.leg = leg;
	}
	
	protected void walk() {
		System.out.println("Hayvanlar yürür:");
	}
	protected void eat() {
		System.out.println("hayvanlar yer:");
	}
	protected void yaz() {
		System.out.println("Hayvanın bacak sayısı:"+leg);
	}


}
