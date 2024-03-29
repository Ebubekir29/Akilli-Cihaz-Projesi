
public class MerkeziIslemBirimi implements IObserver,IMerkeziIslemBirimi {
	
	IEkran ekran = new Ekran();
    boolean sogutucuDurum = false;
    ISicaklikAlgilayici algila = new SicaklikAlgilayici();
    IEyleylici eyleyici = new Eyleyici();
    public void sogutucuAc()
    {
        if(sogutucuDurum == false)
        {
        	sogutucuDurum = eyleyici.sogutucuAc(this);
        	algila.sicaklikDusur(true);
        }
        else
        	hataMesajiAcik();
    }

    public void sogutucuKapat()
    {
        if(sogutucuDurum == true)
        {
        	sogutucuDurum = eyleyici.sogutucuKapat(this);
        	algila.sicaklikYukselt(false);
        }
        else
        	hataMesajiKapali();
    }

    @Override
    public void hataMesajiAcik()
    {
    	 ekran.mesajGoruntule("Arka arkaya iki defa sogutucu acma islemi gerceklestirilemiyor.Tekrar deneyiniz.");
    }
    
    @Override
    public void hataMesajiKapali()
    {
    	 ekran.mesajGoruntule("Sogutucu kapali oldugundan kapatilamiyor.");
    }
    
    public void sicaklikGoster()
    {
    	 ekran.mesajGoruntule("Sicaklik = " + algila.sicaklikDegeri());
    }
}
