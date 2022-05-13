
public class Factory {
	public void MesajGonder(int sicaklik)
	{
		Ekran ekran=new Ekran();
		PostgreSql postgreSql=new PostgreSql();
		
		java.sql.Connection connect=null;
		connect=postgreSql.Baglan();
		
		postgreSql.mesajGonder(sicaklik, connect);
	}
}
