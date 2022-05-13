import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici{
    private int sicaklik;
    private Random rnd = new Random();

    public SicaklikAlgilayici()
    {
        sicaklik = rnd.nextInt(15) + 8;
    }

    public int sicaklikDegeri()
    {
        return sicaklik;
    }

    public void sicaklikDusur(boolean kontrol)
    {
        if(kontrol == true)
        {
            sicaklik -= rnd.nextInt(5);
        }
    }
    public void sicaklikYukselt(boolean kontrol)
    {
    	if(kontrol == false)
        {
            sicaklik += rnd.nextInt(5);
        }
    }
}
