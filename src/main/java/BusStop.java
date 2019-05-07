import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Passenger> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Passenger>();
    }

    public int queueCount(){
        return queue.size();
    }

    public void addPassenger(Passenger passenger){
        queue.add(passenger);
    }

    public Passenger removePassenger(){
        return queue.remove(0);
    }


}
