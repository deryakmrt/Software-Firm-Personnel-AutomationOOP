package MyPackage;

public class Yazilimci extends Personel {
	private int ID;
	public double maas;
	private static int syc = 100;
	
	public Yazilimci(String ad, int yas, double maas) {
		super(ad, yas);
		this.maas = maas;
		this.ID= syc;
		this.Departman= "Yazilim";
		syc+=5; //Id ler 5 er artsın
		
	}
	
	
	/*BilgileriYazdır() metodunu bu sınıfta override ediniz. Personel sınıfındaki
 	BilgileriYazdır() metodunu da kullanarak ekrana sırasıyla departman, id,
 	ad, yaş ve maaş bilgilerini düzgün bir şekilde yazdırınız.*/
	
	// Bilgileri yazdırma metodu - Override
    @Override
    public void BilgileriYazdir() {
        System.out.println("Departman: " + Departman + ", Id: " + ID + ", Ad: " + Ad + ", Yaş: " + Yas + ", Maaş: " + maas);
    }

    // Maaş güncelleme metodu
    public void MaasGuncelle() {
        int dogumYili = 2024 - Yas;
        this.maas += dogumYili;
    }

}
