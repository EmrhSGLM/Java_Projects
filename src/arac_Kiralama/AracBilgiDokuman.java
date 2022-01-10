package arac_Kiralama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AracBilgiDokuman {

   protected static List<Arac> aracList=new ArrayList<Arac>();
   protected static List<String> aracList1=new ArrayList<String>();

   public static List<Arac> aracDepo() {

      aracList.add(new Arac("100", "Opel Astra", "2016", "Motorin", "Manuel", 200));
      aracList.add(new Arac("101", "Peugeot", "2018", "Motorin", "Manuel", 200));
      aracList.add(new Arac("102", "Renault Megane", "2020", "Motorin", "Otomatik", 300));
      aracList.add(new Arac("103", "Renault Clio", "2019", "Motorin", "Manuel", 200));
      aracList.add(new Arac("104", "Opel Vectra", "2010", "Benzin", "Manuel", 200));
      aracList.add(new Arac("105", "Hyundai i30", "2019", "Motorin", "Otomatik", 200));

      return aracList;
   }

   protected List<String> musteriKart= new ArrayList<String>(Arrays.asList("1234","5678","0123","2589","1254"));
   protected List<String> musteriSifre= new ArrayList<String>(Arrays.asList("1234","5678","0123","2589","1254"));


}