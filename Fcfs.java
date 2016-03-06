import java.util.*;
import java.io.*;
public class Fcfs {

	public static void main(String[] args) {
		Scanner sc = new Scanner("Dane.txt");
		ArrayDeque<Integer> dane = new ArrayDeque<Integer>();
		 while(sc.hasNextInt()) {
             dane.add(sc.nextInt());
		 }
		 sc.close();
	}
}
		
