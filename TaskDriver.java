import java.util.Scanner;

public class TaskDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Scanner scan1 = new Scanner (System.in);
		Scanner scan2 = new Scanner (System.in);
		int priority;
		String task;
		
		Task t1 = new Task (null, 0);
		Task t2 = new Task (null, 0);
		Task t3 = new Task (null, 0);

		
		System.out.println ("Enter the priority of task 1 with 10 being maximum, 5 the medium, and 1 being the lowest: ");
		priority = scan.nextInt();
		System.out.println ("Enter task 1 name: ");
		task = scan.nextLine();
		t1.setPriority(priority);
		t1.setTask(task);
		
		System.out.println ("Enter task 2 name: ");
		task = scan.nextLine();
		System.out.println ("Enter the priority of task 2 with 10 being maximum, 5 the medium, and 1 being the lowest: ");
		priority = scan1.nextInt();
		t2.setPriority(priority);
		t2.setTask(task);
		
		
		System.out.println ("Enter the priority of task 3 with 10 being maximum, 5 the medium, and 1 being the lowest: ");
		priority = scan2.nextInt();
		System.out.println ("Enter task 3 name: ");
		task = scan.nextLine();
		t3.setPriority(priority);
		t3.setTask(task);
		
		if ((t1.getPriority() >= t2.getPriority()) && (t2.getPriority() >= t3.getPriority())){
			System.out.println ("Do " + t1.getTask() + " first, then " + t2.getTask() + "second, then " + t3.getTask());
		}
		else if ((t1.getPriority() >= t2.getPriority()) && (t3.getPriority() >= t2.getPriority())) {
			System.out.println ("Do " + t1.getTask() + " first, then " + t3.getTask() + "second, then " + t2.getTask());
		}
		else if ((t1.getPriority() >= t2.getPriority()) && (t3.getPriority() >= t2.getPriority())) {
			System.out.println ("Do " + t1.getTask() + " first, then " + t3.getTask() + "second, then " + t2.getTask());
		}
		else if ((t2.getPriority() >= t3.getPriority()) && (t3.getPriority() >= t1.getPriority())) {
			System.out.println ("Do " + t2.getTask() + " first, then " + t3.getTask() + "second, then " + t1.getTask());
		} 
		else if ((t3.getPriority() >= t1.getPriority()) && (t1.getPriority() >= t2.getPriority())) {
			System.out.println ("Do " + t3.getTask() + " first, then " + t1.getTask() + "second, then " + t2.getTask());
		}
		else{
			System.out.println ("Do " + t3.getTask() + " first, then " + t2.getTask() + "second, then " + t1.getTask());
		}
	}

}
