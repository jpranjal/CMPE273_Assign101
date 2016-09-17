package threading;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTrafficSignal {
	
@Test	
public void testSimulation() {
	TrafficSimulation s = new TrafficSimulation();
	assertEquals(s.runTraffic(), 0 );
}
}
