
public class SogutucuAc implements ISogutucu{
	IEkran ekran = new Ekran();
	@Override
	public void mesaj() {
		ekran.mesajGoruntule("Sogutucu Aciliyor ...");

		ekran.mesajGoruntule("--------------------------------");
	}
}
