package Lab31;

public class HeartRate {
	String adi,soyadi;
	double dogumYili;
	double yas;
	double mhr;
	double thr;
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public double getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
	public double yasHesapla() {
		yas = 2023 - dogumYili;
		return yas;
	}
	public double mhrHesapla() {
		mhr = 220 - yas;
		return mhr;
	}
	public double thrHesapla() {
		thr = mhr *0.85;
		return thr;
	}
	public void show() {
		System.out.println("AD: "+getAdi());
		System.out.println("SOYAD: "+getSoyadi());
		System.out.println("YAS: "+yasHesapla());
		System.out.println("MHR: "+mhrHesapla());
		System.out.println("THR: "+thrHesapla());
	}

}
