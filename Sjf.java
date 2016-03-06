import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class Sjf {

	public static void main(String[] args) throws FileNotFoundException{
		int czas=0;
		int proces=0;
		int i=0;
		FileReader f = new FileReader("Dane.txt");
		Scanner sc = new Scanner(f);
		PriorityQueue <Integer> dane = new PriorityQueue<Integer>();
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
	}
}
