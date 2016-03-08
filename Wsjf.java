import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class Wsjf {

	public static void main(String[] args) throws FileNotFoundException{
		int czas=0;
		int proces=0;
		int i=0;
		String plik;
		System.out.println("Proszê wybrac plik");
		Scanner sc= new Scanner(System.in);
		plik=sc.next();
		FileReader f = new FileReader(plik);
		sc.close();
		sc = new Scanner(f);
		PriorityQueue <Integer> dane = new PriorityQueue<Integer>();
		for (int j = 0; j < 10; j++)
		{
			dane.add(sc.nextInt());
		}
		 while(!dane.isEmpty()){
			 i+=1;
			 proces=dane.remove();
			 if (dane.peek()!=null){
			  if (proces<dane.peek()){
			 	 dane.add(proces);
				 proces=dane.remove();
			  }
			 }
			 System.out.println("Czas oczekiwania na "+i+" proces = "+czas);
			 czas+=proces;
			 if (sc.hasNext() && dane.size() < 5)
			 {
				 dane.add(sc.nextInt());
			 }
		 }
		 sc.close();
	}
}
