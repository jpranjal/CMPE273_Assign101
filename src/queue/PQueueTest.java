package queue;
import static org.junit.Assert.*;

import org.junit.Test;
public class PQueueTest {
	
	PatientQueue patientQueue = new PatientQueue();

	//@Test
	public void testQueue(){
		patientQueue.queue.clear();
		assertEquals(patientQueue.isPriorityIntact(), true);
		
		patientQueue.intialize();
		
		patientQueue.queue.add(new Patient(5, "Patient5", true));
		assertEquals(patientQueue.isPriorityIntact(), true);
		

	}
	
	//@Test
	public void testWithoutEmergency(){
		patientQueue.queue.clear();
		patientQueue.queue.add(new Patient(1, "Patient1", false));
		patientQueue.queue.add(new Patient(2, "Patient2", false));
		patientQueue.queue.add(new Patient(3, "Patient3", false));
		patientQueue.queue.add(new Patient(4, "Patient4", false));
		
		assertEquals(patientQueue.isPriorityIntact(), true);

	}
	
	
	@Test
    public void testClear() {
        patientQueue.queue.clear();
        assertTrue(patientQueue.queue.isEmpty());
        assertEquals(0, patientQueue.queue.size());
        patientQueue.queue.add(new Patient(2, "Patient2", true));
        assertFalse(patientQueue.queue.isEmpty());
        patientQueue.queue.clear();
        assertTrue(patientQueue.queue.isEmpty());
    }
}

