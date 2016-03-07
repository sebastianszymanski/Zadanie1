import java.util.*;
import java.io.*;

public class Rr{
	public static void main(String[] args) throws FileNotFoundException {
		int kwantCzasu = 10;
		int liczus = 0;
		Scanner wej = new Scanner(new File("Dane.txt"));
		ArrayDeque<Rekord> daneak = new ArrayDeque<Rekord>();
		ArrayDeque<Rekord> pamiec = new ArrayDeque<Rekord>();
		int i = 0;
		for (int j = 0; j < 10; j++)
		{
			i++;
			daneak.add(new Rekord(i, wej.nextInt(), 0));
		}
		while (!daneak.isEmpty())
		{
			Rekord temp = daneak.remove();
			if (temp.pozostalyCzasWykonania > kwantCzasu)
			{
				temp.pozostalyCzasWykonania -= kwantCzasu;
				for (Rekord r : daneak)
				{
					r.czasOczekiwania +=kwantCzasu;
				}
				daneak.add(temp);
			}
			else
			{
				for (Rekord r : daneak)
				{
					r.czasOczekiwania += temp.pozostalyCzasWykonania;
				}
				temp.pozostalyCzasWykonania = 0;
				pamiec.add(temp);
				liczus++;
			}
			if (liczus >= 5)
			{
				for (int j = 0;wej.hasNext()&& j < 5; j++)
				{
					i++;
					daneak.add(new Rekord(i, wej.nextInt(), 0));
				}
			liczus = 0;
			}
		}
		
		
		wej.close();
	}

}
