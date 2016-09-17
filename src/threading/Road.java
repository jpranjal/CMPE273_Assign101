package threading;

import java.util.LinkedList;

class Road extends TrafficLight implements Runnable {

private LinkedList<String> queue;

private int number;
private int count;
public int getCount() {
	return count;
}

private TrafficLight light;

public Road(int roadNumber, TrafficLight aLight, int carCount) {
    number = roadNumber;
    light = aLight;
    queue = new LinkedList<String>();
    count = carCount;
    for (int i = 0; i < carCount; i++) {
        queue.add("");
    }
}



public void run() {
		
        count = light.turnGreen(number, count);
        queue.remove();
}

}