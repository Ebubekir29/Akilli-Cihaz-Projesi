import java.util.Scanner;
public class AgArayuzu implements IAgArayuzu{
	public void basla() 
    {
		ISogutucu sogutucuAc = new SogutucuAc();
		ISogutucu sogutucuKapat = new SogutucuKapat();
		ISogutucu sicaklikOlc = new SicaklikOlcme();
		IEkran ekran = new Ekran();
        Scanner scan = new Scanner(System.in);
        String ad;
        String sifre;
        IMerkeziIslemBirimi sogutucu = new MerkeziIslemBirimi();
        while(true)
        {
            ekran.mesajGoruntule("Kullanici Adinizi Giriniz : \n ");
            ad = scan.next();
            ekran.mesajGoruntule("Sifrenizi Giriniz : ");
            sifre = scan.next();
            if(PostgreSql.getInstance().kontrol(ad , sifre))
            {
            	ekran.mesajGoruntule("Veri Tabanina baglaniliyor...");
            	ekran.mesajGoruntule("Veri Tabanina basariyla baglanildi...");
                break;
            }
            else
            	ekran.mesajGoruntule("Veri Tabanina baglaniliyor...");
            	ekran.mesajGoruntule("Veri tabanina baglanilamadi.");
            	 ekran.mesajGoruntule("Kullanici adi veya sifreniz hatalidir. Tekrar deneyiniz.\n");
        }
        byte secim;
        System.out.println("--------------------------");
        while(true) 
        {
    do {
    	 Scanner scan1 = new Scanner(System.in);
    	 ekran.mesajGoruntule("<<<<<<< Menuye Hosgeldiniz >>>>>>>");
    	 ekran.mesajGoruntule("1-Sogutucu Ac");
    	 ekran.mesajGoruntule("2-Sogutucu Kapat ");
    	 ekran.mesajGoruntule("3-Sicaklik Goruntule");
    	 ekran.mesajGoruntule("4-Cikis Yap");
    	 ekran.mesajGoruntule("--------------------------");
            secim = scan1.nextByte();
    }while(!((secim==1)||(secim==2)||(secim==3)||(secim==4)));
           switch(secim)
           {
           case 1: 
        	   sogutucuAc.mesaj();
        	   sogutucu.sogutucuAc();
           break;
           case 2: sogutucu.sogutucuKapat();
           sogutucuKapat.mesaj();
           break;
           case 3: sicaklikOlc.mesaj();
           sogutucu.sicaklikGoster();
           break;
           case 4: ekran.mesajGoruntule("Cikis yapildi.");
           System.exit(1);
           break;
           default :
        	   ekran.mesajGoruntule("Hatali tuslama yaptiniz.");
           }
        }  	
    }
}