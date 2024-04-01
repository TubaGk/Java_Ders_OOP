package Lab61;

public class Fish extends Animal implements Pet {
	String name;
	
	Fish(int leg){
		super(leg);
		//this.name=name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name=name;
		
	}

	@Override
	public void play() {
		System.out.println("baloncuk çıkartır");
			
	}
	protected void eat () {
		
		System.out.println("Balık yem yer");	
	}
	protected void walk () {
		System.out.println("Balık yürümez");	
	}
	protected void yaz() {
		System.out.println("------------");
		super.yaz();
		System.out.println("Balık adı:"+getName());
		play();
		eat();
		walk();
	}
	


}
