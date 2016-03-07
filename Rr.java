import java.util.*;
import java.io.*;

public class Rr{
	public static void main(String[] args) throws FileNotFoundException {
		int kwantCzasu = 10;
		int liczus = 0;
		int czas = 0;
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
				temp.pozostalyCzasWykonania -= 10;
				temp.czasOczekiwania += czas;
				daneak.add(temp);
				czas += 10;
			}
		}
		
		
		wej.close();
	}

}
