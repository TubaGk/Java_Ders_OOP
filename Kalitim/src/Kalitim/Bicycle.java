package Kalitim;

public  class Bicycle {// abstract bu klassta nesne oluşturulmayacak
	protected int pedal;
	protected int hiz;
	protected int vites;
	
	Bicycle(int pedal,int hiz,int vites){
		this.pedal=pedal;
		this.hiz=hiz;
		this.vites=hiz;
	}

	protected int getPedal() {
		return pedal;
	}

	protected void setPedal(int pedal) {
		this.pedal = pedal;
	}

	protected int getHiz() {
		return hiz;
	}

	protected void setHiz(int hiz) {
		this.hiz = hiz;
	}

	protected int getVites() {
		return vites;
	}

	protected void setVites(int vites) {
		this.vites = vites;
	}
	protected void yaz() {
		System.out.println("---------------------------");
		System.out.println("Bisiklet özellikleri");
		System.out.println("----------------------------");
		System.out.println("Pedal capi:"+getPedal());
		System.out.println("Hızı: "+getHiz());
		System.out.println("Vites: "+getVites());
	}
	//protected abstract void deneme();// alt sınıflarda kullanmak zorunlu

}
