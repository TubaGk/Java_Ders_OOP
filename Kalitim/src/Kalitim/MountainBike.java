package Kalitim;

public class MountainBike extends Bicycle{
	protected String suspan;
	
	MountainBike (int pedal,int hiz,int vites,String suspan){
		super(pedal,hiz,vites);
		this.suspan=suspan;		
	}

	protected String getSuspan() {
		return suspan;
	}

	protected void setSuspan(String suspan) {
		this.suspan = suspan;
	}
	protected void yaz () {
		super.yaz();
		System.out.println("Süspansiyon sistemi: "+getSuspan());
		System.out.println("---------------------------------");
	}
	protected  void deneme() {
		System.out.println("deneme");
		
	}
	

}
