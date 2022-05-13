import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSql implements IVeriTabaniSurucu{

    private static PostgreSql instance = null;
    private synchronized static void createInstance() {
        if (instance == null)
            instance = new PostgreSql();
    }
    public static PostgreSql getInstance() {
        if (instance == null)
            createInstance();
        return instance;
    }

    public Connection Baglan(){

        Connection kontrol=null;
        String jdbc = "jdbc:postgresql://localhost:2351/NYAT_PROJE";
        String ad = "postgres";
        String sifre = "2351";
        try {
        	kontrol = DriverManager.getConnection(jdbc,ad,sifre);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kontrol;
    }

    public boolean kontrol(String KullaniciAdi , String Sifre)
    {
        String sql= "SELECT * FROM \"public\".\"kullanici\"";
        String ad = "";
        String sifre = "";

        Connection kontrol=this.Baglan();
        try{
            Statement statement = kontrol.createStatement();
            ResultSet resultset = statement.executeQuery(sql);

            kontrol.close();

            while(resultset.next())
            {
                ad = resultset.getString("ad");
                sifre = resultset.getString("sifre");
            }
            resultset.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ad.equals(KullaniciAdi) && sifre.equals(Sifre);
    }
    public void mesajGonder(int sicaklik, Connection connect)
	{
    	Ekran ekran = new Ekran();
		try 
		{
			if(connect!=null)
			{	
				if(sicaklik>40)
				{
				String mesaj="Uyari: Sicaklik "+sicaklik+" derece!";
				java.sql.Statement st=connect.createStatement();	
				}
				else
				{
					ekran.mesajGoruntule("Sicaklik normal.");
				}
			}
			else
			{
				ekran.mesajGoruntule("Veri Tabanina baglanti basarisiz!");
			}
		}
		catch(Exception e)
		{
			ekran.mesajGoruntule("Hata: "+e);
		}
	}
}