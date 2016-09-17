package threading;

class TrafficLight {


private int rNumber;


public TrafficLight() {
}


public int turnGreen(int roadNumber, int count) {
    rNumber = roadNumber;
    synchronized (this) {

        System.out.print("Light turned green by road" + rNumber
                +"\n"
                + "Waiting for road" + rNumber + " cars to clear intersection \n");

        int temp = count ;
        for (int i = temp; (i >= 0); i--, count--) {

            System.out.print("Car"+i + " ");

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("\nCars left = " + ++count);
        System.out.println("Road"+rNumber + " light turned red.");
        System.out.print("\n \n");
        return count;
    }

}
}