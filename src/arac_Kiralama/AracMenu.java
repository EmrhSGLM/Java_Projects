package arac_Kiralama;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Scanner;


public class AracMenu extends Arac implements yetkili, musteri, odeme {

    static int tercih;
    static int sayac;
    static String tc;
    static String sifre;
    static double odenecekTutar;
    static double gunlukTutar;
    static double indirimOrani=1;
    static long kiraGunu;
    static String sfr;
    static int gun;
    static int ay;
    static int yil;

    public void anaMenu() {
        Scanner scan=new Scanner(System.in);
        if(sayac==0) {
            System.out.println("WELCOME to OuAlity Rent Car ");
            System.out.print("\tOuAlity Rent Car \n1 => Yetkili Girisi " +
                    "\n2 => Musteri Girisi \nTercihinizi yapiniz => ");
            sayac++;
        }else if(sayac > 0){
            System.out.print("\tOuAlity Rent Car \n1 => Yetkili Girisi " +
                    "\n2 => Musteri Girisi \nTercihinizi yapiniz => ");
            sayac++;
        }
        tercih = scan.nextInt();
        if(tercih==1){
            yetkili();
        }else if(tercih==2){
            musteri();

        }

    }

    @Override
    public void yetkili() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kimlik numaranizi giriniz : ");
        tc=scan.nextLine();
        System.out.println("Sifrenizi giriniz : ");
        sifre=scan.nextLine();
        if(tc.equalsIgnoreCase(sifre)){
            System.out.println("Yapacaginiz islemi secin \n\t1-Arac Ekleme " +
                    "\n\t2-Arac silme \n\t3-Ana Menu \n\t4- Cikis \nTercihinizi yapiniz");
            tercih=scan.nextInt();
            switch(tercih) {
                case 1:
                    ekleme();
                    yetkili();
                    break;
                case 2:
                    ekleme();
                    yetkili();
                    break;
                case 3:
                    anaMenu();
                    break;
                case 4:
                    cikis();
                    break;
                default :
                    System.out.println("Hatali giris yaptiniz ");
                    break;
            }

        }

    }

    @Override
    public void ekleme() {
        boolean cikis=true;

        while(cikis) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Arac id numarasini giriniz => ");
            String id=scan.nextLine();
            super.setId(id);
            System.out.println("Arac markasini giriniz => ");
            String marka=scan.nextLine();
            super.setMarka(marka);
            System.out.println("Arac modelini giriniz => ");
            String model=scan.nextLine();
            super.setModel(model);
            System.out.println("Arac yakit tipini giriniz => ");
            String yakitTipi=scan.nextLine();
            super.setYakitTipi(yakitTipi);
            System.out.println("Arac vites cesidini giriniz => ");
            String vites=scan.nextLine();
            super.setVites(vites);
            System.out.println("Arac'in gunluk ucretini giriniz => ");
            double gnlkUcrt=scan.nextDouble();
            super.setGunlukUcret(gnlkUcrt);

            super.aracList.add(new Arac(id,marka,model,yakitTipi,vites,gnlkUcrt));
            System.out.println(aracList.toString());
            System.out.println("Yapacaginiz islemi secin \n\t1-Arac Ekleme " +
                    "\n\t2-Kulanici Sayfasi \n\t3-Cikis  \nTercihinizi yapiniz");
            tercih=scan.nextInt();
            switch(tercih) {
                case 1:
                    ekleme();
                    break;
                case 2:
                    yetkili();
                    break;
                case 3:
                    cikis();
                    break;
                default :
                    System.out.println("Hatali giris yaptiniz ");
                    break;
            }

        }

    }

    @Override
    public void silme() {
        boolean cikis=true;
        while(cikis) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Silmek istediginiz aracin id'sini giriniz => ");
            String id=scan.nextLine();
            int silIndex=0;
            int count=0;
            for(int i=0; i < aracList.size() ;i++){
                if(id.contains(aracList.toString().substring(i,i+1))) {
                    silIndex=i;
                    count++;
                    break;
                }
            }
            if(count > 0) {
                aracList.remove(silIndex);
                System.out.println(silIndex + " id numarali araciniz envanterden cikarildi");
                System.out.println(aracList.toString());
            } else if( count == 0){
                System.out.println(silIndex + " id numarali arac envanterde bulunmamaktadir");
            }

            System.out.println("Yapacaginiz islemi secin \n\t1-Arac Silme " +
                    "\n\t2-Kulanici Sayfasi \n\t3-Cikis  \nTercihinizi yapiniz");
            tercih=scan.nextInt();
            switch(tercih) {
                case 1:
                    silme();
                    break;
                case 2:
                    yetkili();
                    break;
                case 3:
                    cikis();
                    break;
                default :
                    System.out.println("Hatali giris yaptiniz ");
                    break;
            }

        }



    }

    @Override
    public void musteri() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Isleminizi seciniz \n\t1- Araclari listele \n\t2- Arac kirala " +
                "\n\t3- Cikis");
        tercih=scan.nextInt();
        switch (tercih) {
            case 1:
                aracList.stream().forEach(System.out::println);
                musteri();
                break;
            case 2:
                aracKirala();
                break;
            case 3:
                cikis();
                break;


        }
    }

    private void cikis() {
        System.out.println("Trafik kurallarina uyalim \n\t Iyı Gunler " +
                "\n\t\tBizi Tercih ettiginiz icin TESEKKUR EDERIZ");
    }

    @Override
    public void aracListele() {
        System.out.println(aracList.toString());
        Scanner scan = new Scanner(System.in);
        System.out.println("Isleminizi seciniz \n\t1- Araclari listele \n\t2- Arac kirala " +
                "\n\t3- Cikis");
        tercih=scan.nextInt();
        switch (tercih) {
            case 1:
                aracListele();
                break;
            case 2:
                aracKirala();
                break;
            case 3:
                cikis();
                break;


        }



    }

    @Override
    public void aracKirala() {
        Scanner scan=new Scanner (System.in);
        System.out.println("Sectiginiz aracin id numarasini giriniz : ");
        String tercih1=scan.next();

        for(int i=0;i<aracList.size();i++){
            //System.out.println(aracList.get(i));
            if(aracList.get(i).toString().contains(tercih1)){
                System.out.println("Sectiginiz arac  \n" + aracList.get(i));
                gunlukTutar = aracList.get(i).getGunlukUcret();
                break;
            }
        }
        System.out.println("Odeme islemini seciniz \n\t1-Pesin " +
                "\n\t2-Kredi Karti \nTercihinizi yapiniz => ");
        tercih=scan.nextInt();
        switch (tercih) {
            case 1:
                pesin();
                break;
            case 2:
                kKarti();
                break;
            case 3:

            default:
                System.out.println("Hatali giris yaptiniz ");
                break;
        }

    }




    @Override
    public void gunHesabi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\tIndirim Oranlari \n\n5-10 gun arasi => %10 \n10-15 gun arasi => %15  " +
                "\n15 gun den sonrasi => %20 \n\n\tindirim uygulanacaktir");
        System.out.println("\nAraci alacaginiz tarih => ");
        System.out.print("Gun : ");
        gun=scan.nextInt();
        System.out.print(" Ay : ");
        ay=scan.nextInt();
        System.out.print(" Yil : ");
        yil=scan.nextInt();
        LocalDate alncTrh = LocalDate(yil,ay,gun);
        System.out.println("Aracin teslim edilecegi tarih => ");
        System.out.print("Gun : ");
        gun=scan.nextInt();
        System.out.print(" Ay : ");
        ay=scan.nextInt();
        System.out.print(" Yil : ");
        yil=scan.nextInt();
        LocalDate teslimEdlckTrh = LocalDate(yil,ay,gun);
        if(teslimEdlckTrh.getYear()<alncTrh.getYear()){
            gunHesabi();
        }


        kiraGunu = ChronoUnit.DAYS.between(alncTrh, teslimEdlckTrh);

        System.out.println("Arac'in toplamda kiralanacagi gun sayisi => "+kiraGunu);
    }

    @Override
    public void indirim() {
        Scanner scan = new Scanner(System.in);
        if(kiraGunu < 5){
        }else if(kiraGunu >= 5 && kiraGunu <= 10){
            System.out.println("%10 indirim uygulandi ");
            indirimOrani=0.9;
        }else if(kiraGunu > 10 && kiraGunu >= 15){
            System.out.println("%15 indirim uygulandi ");
            indirimOrani=0.85;
        }else if(kiraGunu > 15) {
            System.out.println("%20 indirim uygulandi ");
            indirimOrani=0.8;
        }


    }

    @Override
    public void pesin() {
        Scanner scan = new Scanner(System.in);
        gunHesabi();
        indirim();
        odenecekTutar=gunlukTutar*kiraGunu;
        System.out.println("Toplam Tutar => " + odenecekTutar);
        odenecekTutar=gunlukTutar*kiraGunu*indirimOrani;
        System.out.println("Odenecek Tutar => " + odenecekTutar);
        for(int i=1;i>0;i++) {
            System.out.println("Lutfen odemeyi yapiniz => ");
            double musteriTutar = scan.nextDouble();
            if (musteriTutar == odenecekTutar) {
                System.out.println("Odeme gerceklesti ");
                musteri();
                break;
            } else if (musteriTutar > odenecekTutar) {
                System.out.println("Para ustu => " + (musteriTutar - odenecekTutar));
                System.out.println("Odeme gerceklesti ");
                musteri();
                break;
            } else if (musteriTutar < odenecekTutar) {
                System.out.println("Odenen tutar yetersiz ");
                odenecekTutar = odenecekTutar - musteriTutar;
                System.out.println(odenecekTutar + " Tl eksik odediniz ");
            }
        }


    }



    @Override
    public void kKarti() {
        Scanner scan = new Scanner(System.in);
        gunHesabi();
        odenecekTutar=gunlukTutar*kiraGunu;
        System.out.println("Toplam Tutar => " + odenecekTutar);
        odenecekTutar=gunlukTutar*kiraGunu*indirimOrani;
        for(int i=1;i>0;i++) {
            System.out.print("Kredi Kari numaranizi giriniz : ");
            String kKartNo = scan.nextLine().replaceAll("\\s", "");

            for(int j=0;j<musteriKart.size();j++) {
                if(kKartNo.equalsIgnoreCase(musteriKart.get(j))){
                    sfr=musteriSifre.get(j);
                }
            }
            System.out.print("Sifrenizi giriniz : ");
            String sifre = scan.next();

            if(sifre.equals(sfr)){
                System.out.println("Odemeniz gerceklesti ");
                musteri();
                break;
            }else {
                System.out.println("Hatali giris yaptiniz ");

            }

        }

    }

    private static LocalDate LocalDate(int i, int j, int k) {
        yil=i;
         ay=j;
         gun=k;
        return LocalDate.of(i, j, k);
    }

}
