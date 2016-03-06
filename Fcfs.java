import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class Fcfs {

	public static void main(String[] args) throws FileNotFoundException{
		int czas=0;
		FileReader f = new FileReader("Dane.txt");
		Scanner sc = new Scanner(f);
		ArrayDeque<Integer> dane = new ArrayDeque<Integer>();
		 while(sc.hasNextInt()) {
             dane.add(sc.nextInt());
		 }
		 sc.close();
		 while(!dane.isEmpty()){
			 czas+=dane.remove();
		 }
		 System.out.println("Czas = "+Integer.toString(czas)+" ");
	}
}
				
