
public class SogutucuKapat implements ISogutucu{
	IEkran ekran = new Ekran();
	@Override
	public void mesaj() {
		ekran.mesajGoruntule("Sogutucu Kapatiliyor ...");

		ekran.mesajGoruntule("--------------------------------");
	}
}
