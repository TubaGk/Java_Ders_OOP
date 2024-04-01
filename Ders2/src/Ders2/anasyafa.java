package Ders2;

public class anasyafa {

	public static void main(String[] args) {
		//
		test person1 =new test("ahmet","mehmet",500);
		test person2 =new test("ali","veli",800);
		System.out.println(person1.getAdi());
		System.out.println(person2.getPara());
		System.out.println(person1.getPara());
		person1.bakiye(100);
		System.out.println(person1.getPara());

	}

}
