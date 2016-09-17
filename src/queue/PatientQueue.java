package queue;
import java.util.PriorityQueue;

public class PatientQueue{


	public PriorityQueue<Patient> queue = new PriorityQueue<Patient>(5);

	public void intialize(){
		queue.add(new Patient(1, "Patient1", false));
		queue.add(new Patient(2, "Patient2", false));
		queue.add(new Patient(3, "Patient3", false));
		queue.add(new Patient(4, "Patient4", true));
	}
	
	public boolean isPriorityIntact(){
		if( queue.isEmpty())
			return true;
		else{
			Patient p  = queue.peek();
			Patient temp = null;
			
			for (Patient pat : queue) {
			System.out.println("abcb" +pat.getName());
			}
			
			for (Patient e : queue) {
				if(e.isEmergencyCase()){
					temp = e;
					break;
				}
			}
			if (null == temp || temp.equals(p))
				return true;
			else return false;
			
		}
	}
	
}