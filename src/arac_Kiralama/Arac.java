package arac_Kiralama;

import java.util.ArrayList;
import java.util.List;

public class Arac extends AracBilgiDokuman {

   // List<Arac> aracList=new ArrayList<Arac>();

   private String id;
   private String marka; //(liste araclari --> opel toyota volvo)
   private String model;  //(astra corolla s60)
   private String yakitTipi;  //(diesel benzin)
   private String vites; //(manuel otomatik)
   private double gunlukUcret; //( 100 120 150... liste dısı arac=300)

    public Arac() {

    }

    public Arac(String id,String marka, String model, String yakitTipi,
                String vites, double gunlukUcret) {
        this.id=id;
        this.marka = marka;
        this.model = model;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "id='" + id + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTipi='" + yakitTipi + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukUcret=" + gunlukUcret +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = this.model;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }
}
