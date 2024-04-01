package Ders3;

public class student {
	String adi,soyadi;
	int not;
	static int count = 0;
	
	public String getAdi() {
		return this.adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
		count++;
	}
	public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
	public int getNot() {
		return not;
	}
	public void setNot(int not) {
		this.not = not;
	}
	public void show() {
		System.out.println(getAdi()+" "+getSoyadi()+": " +getNot()+"-> "+harfNotuHesapla());
	}
	public String harfNotuHesapla() {
		if (not >= 90) {
            return "A";
        }  else if (not >= 80) {
            return "B";
        }  else if (not >= 70) {
            return "C";
        }  else if (not >= 60) {
            return "D";
        } else if (  0 < not ) {
            return "F (Kaldınız)";
        } else {
        	return "hatalı not girisi";
        }
        
	}

}
