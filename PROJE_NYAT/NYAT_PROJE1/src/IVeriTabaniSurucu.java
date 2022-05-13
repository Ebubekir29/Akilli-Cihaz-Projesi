import java.sql.Connection;

public interface IVeriTabaniSurucu {
	boolean kontrol(String KullaniciAdi , String Sifre);
	public void mesajGonder(int sicaklik, Connection connect);
}
