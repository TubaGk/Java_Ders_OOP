package Ders2;

public class test {
	String adi,soyadi;
	int para;
	public test(String adi, String soyadi, int para) {
		super();
		this.adi = adi; //1. adi yukardaki string ,2. adi parantez icindeki
		this.soyadi = soyadi;
		this.para = para;
	}
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
	public int getPara() {
		return para;
	}
	private void setPara(int para) {
		this.para = para;
	}
	public void bakiye(int a) {
		this.para = this.para +a;
		setPara(this.para);
	}

}
