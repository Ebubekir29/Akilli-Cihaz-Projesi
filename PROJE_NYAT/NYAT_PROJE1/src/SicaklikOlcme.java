
public class SicaklikOlcme implements ISogutucu{
	IEkran ekran = new Ekran();
	@Override
	public void mesaj(){
		ekran.mesajGoruntule("Sicaklik olculuyor...");
		
		ekran.mesajGoruntule("--------------------------------");

        ekran.mesajGoruntule("Sicaklik olculdu ...\n");
	}
}
