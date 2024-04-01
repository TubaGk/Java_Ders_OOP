package Interfacee;

public class Bike implements Vehicle {
	int speed ;
	int gear;

	@Override
	public void changeGear(int a) {
		gear = a;
		
		
	}

	@Override
	public void speedUp(int a) {
		speed = speed+a;
		
	}

	@Override
	public void applyBreak(int a) {
		speed= speed-a;
		
	}
	protected void yaz() {
		System.out.println("Hiz: "+speed);
		System.out.println("Vites: "+gear);
	}
	
}
