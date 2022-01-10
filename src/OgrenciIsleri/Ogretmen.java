package OgrenciIsleri;

public class Ogretmen extends Kisi {
	
	private String sicilNo;
	private String bolum;
	
	public Ogretmen() {
		
	}
	
	
	@Override
	public String toString() {
		return "Ogretmen [getAdSoyad()=" + getAdSoyad() + ", getKimlikNo()=" + getKimlikNo() + "]";
	}



	public Ogretmen(String sicilNo, String bolum,String adSoyad, String kimlikNo, int yas) {
		super(adSoyad, kimlikNo, yas);
		this.sicilNo = sicilNo;
		this.bolum = bolum;
	}


	public String getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	
	
	

}
