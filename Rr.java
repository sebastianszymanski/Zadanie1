import java.util.*;
import java.io.*;

public class Rr{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner wej = new Scanner(new File("Dane.txt"));
		Scanner wej2 = new Scanner(new File("Dane.txt"));
		ArrayDeque<Rekord> danecp = new ArrayDeque<Rekord>();
		ArrayDeque<Rekord> daneak = new ArrayDeque<Rekord>();
		int i = 0;
		while (wej.hasNext())
		{
			i++;
			danecp.add(new Rekord(i, wej.nextInt(), 0));
		}
		wej.close();
		wej2.close();
	}

}
