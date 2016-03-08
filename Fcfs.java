import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class Fcfs {

	public static void main(String[] args) throws FileNotFoundException{
		int czas=0;
		int proces=0;
		int i=0;
		String plik;
		System.out.println("Proszę wybrac plik");
		Scanner sc= new Scanner(System.in);
		plik=sc.next();
		FileReader f = new FileReader(plik);
		sc.close();
		sc = new Scanner(f);
		ArrayDeque<Integer> dane = new ArrayDeque<Integer>();
		 while(sc.hasNextInt()) {
                         dane.add(sc.nextInt());
		 }
		 sc.close();
		 while(!dane.isEmpty()){
			 i+=1;
			 proces=dane.remove();
			 System.out.println("Czas oczekiwania na "+i+" proces = "+czas);
			 czas+=proces;
		 }
		 czas=0;
		 proces=0;
	}
}
