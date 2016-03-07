import java.util.*;
import java.io.*;

public class Rr {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner wej = new Scanner(new File("Dane.txt"));
		ArrayDeque<Integer> dane = new ArrayDeque<Integer>();
		while (wej.hasNext())
		{
			dane.add(wej.nextInt());
		}
		wej.close();
	}

}
