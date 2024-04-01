package Lab61;

public class Spider extends Animal {

	Spider(int leg) {
		super(leg);
	}
	protected void eat () {
		
		System.out.println("Örümcek et yer");	
	}
	protected void yaz() {
		System.out.println("------------");
		eat();
		super.yaz();
	}


}
