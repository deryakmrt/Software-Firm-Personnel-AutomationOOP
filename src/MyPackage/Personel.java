package MyPackage;

public class Personel {
	public String Ad;
	public int Yas;
	public String Departman;
	
	
	public Personel(String ad, int yas) {
		Ad = ad;
		Yas = yas;
	}
	
	public void BilgileriYazdir() {
	     System.out.println("Ad: " + Ad + ", Yas: " + Yas);
	 }

}
