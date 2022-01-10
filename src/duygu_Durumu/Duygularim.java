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
	private  int yetersizlik;
	protected static List<String> list=new ArrayList<>();
	protected static List<Integer> duyguPuan=new ArrayList<>();
	
	public Duygularim() {
		
	}
	
	public Duygularim(int mutluluk, int korku, int kiskanclik, int huzun, int utanc, int ofke, int gurur, int heyecan,
			int tiksinti, int darlanma,int yetersizlik) {
		super();
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
		this.yetersizlik = yetersizlik;
	}
	
	


}
