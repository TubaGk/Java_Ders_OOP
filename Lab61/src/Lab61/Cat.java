package Lab61;

public class Cat extends Animal implements Pet  {
	String name;
	
	Cat(int leg){
		super(leg);
	}
	
	Cat(int leg,String name) {
		super(leg);
		this.name= name;
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
		System.out.println("kediler top oynar");

		
	}
	protected void eat () {
		
		System.out.println("kedi mama yer");	
	}
	protected void yaz() {
		System.out.println("------------");
		super.yaz();
		System.out.println("Kedi adı:"+getName());
		play();
		eat();
	}
	


}
