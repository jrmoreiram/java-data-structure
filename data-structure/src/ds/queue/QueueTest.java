package ds.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queues queues = new Queues();

		queues.addStudent("Mauricio");
		queues.addStudent("Guilherme");

		System.out.println("queue:" + queues);

		String x1 = queues.removeStudent();
		System.out.println("removeStudent(x1):" + x1);
		System.out.println("queue:" + queues);

		// Implementacao java para filas.
		Queue<String> javaQueue = new LinkedList<String>();
		javaQueue.add("Jean");
		String x2 = javaQueue.poll();

		System.out.println("javaQueue:" + x2);
	}
}
