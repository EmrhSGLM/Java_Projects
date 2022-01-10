package OgrenciIsleri;

public class Ogrenci extends Kisi {
	
	
	private String numara;
	private String sinif;
	
	public Ogrenci() {
		
	}
	
		
	
	@Override
	public String toString() {
		return "Ogrenci [numara " + numara + ", AdSoyad " + getAdSoyad() + ", KimlikNo "
				+ getKimlikNo() + "]";
	}



	public Ogrenci(String adSoyad, String kimlikNo, int yas,String numara, String sinif) {
		super(adSoyad, kimlikNo, yas);
		this.numara = numara;
		this.sinif = sinif;
	}
	
	
	public String getNumara() {
		return numara;
	}
	public void setNumara(String numara) {
		this.numara = numara;
	}
	public String getSinif() {
		return sinif;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
	
	

}
