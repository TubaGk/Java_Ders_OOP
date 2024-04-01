package Lab32;

public class HealtyProfile {
	String adi,soyadi;
	double dogumYili;
	double yas;
	double mhr;
	double thr;
	double boy;
	double kilo;
	double bmi;
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
	public void setDogumYili(double dogumYili) {
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
	public double getBoy() {
		return boy;
	}
	public void setBoy(double boy) {
		this.boy = boy;
	}
	public double getKilo() {
		return kilo;
	}
	public void setKilo(double kilo) {
		this.kilo = kilo;
	}
	public double durumGoster() {
		bmi = kilo / ((boy * boy)/10000);
		if (bmi < 18.5)
			System.out.println("Zayıf");
		if (18.5 < bmi && bmi <= 24.9)
			System.out.println("Normal");
		if (24.9 < bmi  && bmi <= 29.9)
			System.out.println("Şişman");
		if (29.9 < bmi)
			System.out.println("Obez");
		return bmi;
		}
	
	public void show() {
		System.out.println("AD: "+getAdi());
		System.out.println("SOYAD:  "+getSoyadi());
		System.out.println("YAS: "+yasHesapla());
		System.out.println("MHR: "+mhrHesapla());
		System.out.println("THR: "+thrHesapla());
		System.out.println("BMİ: "+durumGoster());
	}
	

}
	
