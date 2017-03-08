
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	
	//PROGRAM WYKONANY W RAMACH SZKOLENIA KM-PROGRAMS
	//http://km-programs.pl/

	public static void main(String[] args) {

		Queue<Patient> pacjentQueue = new PriorityQueue<>(
				(p1, p2) -> Integer.compare(p1.getPriority(), p2.getPriority()));

		Patient p1 = new Patient("Jurek", "Karp", 5);
		Patient p2 = new Patient("Sebastian", "Miska", 1);
		Patient p3 = new Patient("Barbara", "Barabara", 4);
		Patient p4 = new Patient("Jurek", "Ogorek", 3);
		Patient p5 = new Patient("Ania", "Kania", 2);
		Patient p6 = new Patient("Maria", "Konopnicka", 7);

		pacjentQueue.offer(p1);
		pacjentQueue.offer(p2);
		pacjentQueue.offer(p3);
		pacjentQueue.offer(p4);
		pacjentQueue.offer(p5);
		pacjentQueue.offer(p6);

		while (!pacjentQueue.isEmpty()) {
			System.out.println(pacjentQueue.poll());
		}

	}

}
