import java.util.*;

import java.io.*;

public class Rr{
	public static void main(String[] args) throws FileNotFoundException {
		int kwantCzasu = 10;
		int czas = 0;
		int czasc = 0;
		Scanner wej = new Scanner(new File("Dane.txt"));
		ArrayDeque<Rekord> daneak = new ArrayDeque<Rekord>();
		SortedMap<Integer, Rekord> pamiec = new TreeMap<Integer, Rekord>();
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
				czas += kwantCzasu;
			}
			else
			{
				for (Rekord r : daneak)
				{
					r.czasOczekiwania += temp.pozostalyCzasWykonania;
				}
				czas += temp.pozostalyCzasWykonania;
				temp.pozostalyCzasWykonania = 0;
				pamiec.put(temp.numerProcesu, temp);
			}
			if (wej.hasNext() && czas > 12)
			{
				i++;
				daneak.add(new Rekord(i, wej.nextInt(), 0));
				czas = 0;
			}

		}
		
		
		wej.close();
		System.out.println(i);
		for (int j = 1; j <= i; j++)
		{
			czasc += pamiec.get(j).czasOczekiwania;
			System.out.println(pamiec.get(j));
		}
		float te = czasc/i;
		System.out.println("Œredni czas oczekiwania wyniós³ " + te + " ms");
	}

}
