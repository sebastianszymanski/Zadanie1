
public class Rekord  {

	public int numerProcesu;
	public int pozostalyCzasWykonania;
	public int czasOczekiwania;
	
	public Rekord(int np, int pcw, int co)
	{
		numerProcesu = np;
		pozostalyCzasWykonania = pcw;
		czasOczekiwania = co;
	}
	
	public String toString()
	{
		return numerProcesu + " " + czasOczekiwania;
	}

}
