package threading;

public class TrafficSimulation  {
	private Road road1 ;
	private Road road2 ;
	private Road road3 ;
	private Road road4 ;
	public Road getRoad1() {
		return road1;
	}

	public void setRoad1(Road road1) {
		this.road1 = road1;
	}

	public Road getRoad2() {
		return road2;
	}

	public void setRoad2(Road road2) {
		this.road2 = road2;
	}

	public Road getRoad3() {
		return road3;
	}

	public void setRoad3(Road road3) {
		this.road3 = road3;
	}

	public Road getRoad4() {
		return road4;
	}

	public void setRoad4(Road road4) {
		this.road4 = road4;
	}

	public TrafficSimulation(){
	    TrafficLight light = new TrafficLight();
	    road1 = new Road(1, light, 10);
	    road2 = new Road(2, light,5);
	    road3 = new Road(3, light,6);
	    road4 = new Road(4, light,7);
	    thread1 = new Thread((Runnable) road1);
	    thread2 = new Thread((Runnable) road2);
	    thread3 = new Thread((Runnable) road3);
	    thread4 = new Thread((Runnable) road4);
	}
private Thread thread1, thread2, thread3, thread4;

public int runTraffic() {
    this.go();
    int carsLeft = this.getRoad1().getCount() + this.getRoad2().getCount() + this.getRoad3().getCount() + this.getRoad4().getCount();

    return carsLeft;
}

 public void go() 
 {
    try {
	thread1.start();
	thread1.join();
	thread2.start();
    thread2.join(); 
    thread3.start();
    thread3.join();
    thread4.start();
    thread4.join();
    } catch (InterruptedException e) {
		e.printStackTrace();
	} 
}
}

 