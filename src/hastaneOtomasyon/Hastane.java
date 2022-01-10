package hastaneOtomasyon;

public class Hastane extends VeriBankasi {
	
	
	
	Doktor doktor= new Doktor();
	Hasta hasta= new Hasta();
	Durum durum = new Durum();
	
	
	public Doktor getDoktor() {
		return doktor;
	}
	public void setDoktor(Doktor doktor) {
		this.doktor = doktor;
	}
	public Hasta getHasta() {
		return hasta;
	}
	public void setHasta(Hasta hasta) {
		this.hasta = hasta;
	}
	
}
