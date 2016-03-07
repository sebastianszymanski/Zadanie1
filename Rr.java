import java.util.*;
import java.io.*;

public class Rr {

	public class Rekord
	{
		public int numerProcesu;
		public int pozostalyCzasWykonania;
		public int czasOczekiwania;
		
		public Rekord(int np, int pcw, int co)
		{
			numerProcesu = np;
			pozostalyCzasWykonania = pcw;
			czasOczekiwania = co;
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {

		Scanner wej = new Scanner(new File("Dane.txt"));
		Scanner wej2 = new Scanner(new File("Dane.txt"));
		ArrayDeque<Integer> danecp = new ArrayDeque<Integer>();
		ArrayDeque<Integer> daneak = new ArrayDeque<Integer>();
		while (wej.hasNext())
		{
			danecp.add(wej.nextInt());
		}
		wej.close();
		wej2.close();
	}

}
