package Ders3;

public class test {

	public static void main(String[] args) {
		// 
		student ogr1 = new student();
		student ogr2 = new student();
		ogr1.setAdi("Ali");
		ogr1.setSoyadi("Veli");
		ogr1.setNot(90);
		ogr2.setAdi("Ahmet");
		ogr2.setSoyadi("Mehmet");
		ogr2.setNot(50);
		//System.out.println(ogr1.getAdi()+" "+ogr1.getSoyadi()+": " +ogr1.getNot());
		ogr1.show();
		ogr2.show();
		System.out.println("ogrenci sayisi:"+student.count);

	}

}
