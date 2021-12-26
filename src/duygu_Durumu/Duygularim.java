package duygu_Durumu;

import java.util.ArrayList;
import java.util.List;

public class Duygularim {
	
	
	private  int mutluluk;
	private	 int korku;
	private  int kiskanclik;
	private  int huzun;
	private  int utanc;
	private  int ofke;
	private  int gurur;
	private  int heyecan;
	private  int tiksinti;
	private  int darlanma;
	private  int yetersiz;
	protected static List<String> list=new ArrayList<>();
	protected static List<Integer> duyguPuan=new ArrayList<>();
    Duygularim(){
    	
    }
    
	public Duygularim(int mutluluk, int korku, int kiskanclik, int huzun, int utanc, int ofke, int gurur, int heyecan,
			int tiksinti, int darlanma, int yetersiz) {
		this.mutluluk = mutluluk;
		this.korku = korku;
		this.kiskanclik = kiskanclik;
		this.huzun = huzun;
		this.utanc = utanc;
		this.ofke = ofke;
		this.gurur = gurur;
		this.heyecan = heyecan;
		this.tiksinti = tiksinti;
		this.darlanma = darlanma;
		this.yetersiz = yetersiz;
	}
	
	@Override
	public String toString() {
		return "Duygularim [mutluluk=" + mutluluk + ", korku=" + korku + ", kiskanclik=" + kiskanclik + ", huzun=" + huzun
				+ ", utanc=" + utanc + ", Ofke=" + ofke + ", gurur=" + gurur + ", heyecan=" + heyecan + ", tiksinti="
				+ tiksinti + ", darlanma=" + darlanma + ", yetersiz=" + yetersiz + "]";
	}

	public int getMutluluk() {
		return mutluluk;
	}

	public void setMutluluk(int mutluluk) {
		this.mutluluk = mutluluk;
	}

	public int getKorku() {
		return korku;
	}

	public void setKorku(int korku) {
		this.korku = korku;
	}

	public int getKiskanclik() {
		return kiskanclik;
	}

	public void setKiskanclik(int kiskanclik) {
		this.kiskanclik = kiskanclik;
	}

	public int getHuzun() {
		return huzun;
	}

	public void setHuzun(int huzun) {
		this.huzun = huzun;
	}

	public int getUtanc() {
		return utanc;
	}

	public void setUtanc(int utanc) {
		this.utanc = utanc;
	}

	public int getOfke() {
		return ofke;
	}

	public void setOfke(int ofke) {
		this.ofke = ofke;
	}

	public int getGurur() {
		return gurur;
	}

	public void setGurur(int gurur) {
		this.gurur = gurur;
	}

	public int getHeyecan() {
		return heyecan;
	}

	public void setHeyecan(int heyecan) {
		this.heyecan = heyecan;
	}

	public int getTiksinti() {
		return tiksinti;
	}

	public void setTiksinti(int tiksinti) {
		this.tiksinti = tiksinti;
	}

	public int getDarlanma() {
		return darlanma;
	}

	public void setDarlanma(int darlanma) {
		this.darlanma = darlanma;
	}

	public int getYetersiz() {
		return yetersiz;
	}

	public void setYetersiz(int yetersiz) {
		this.yetersiz = yetersiz;
	}

	
}
