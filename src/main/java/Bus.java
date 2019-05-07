import java.util.ArrayList;

public class Bus {

    private ArrayList<Passenger> passengers;
    private int capacity;
    private String destination;

    public Bus(){
        this.passengers = new ArrayList<>();
        this.capacity = 5;
        this.destination = "Edinburgh";
    }

    public int passengerCount(){
        return passengers.size();
    }

    public boolean addPassenger(Passenger passenger){
        if (this.isFull()) {
            return false;
        }
        passengers.add(passenger);
        return true;
    }

    public int checkCapacity() {
        return capacity;
    }

    public boolean isFull(){
        if(this.passengerCount() >= this.capacity)
            return true;
        return false;
    }

    public Passenger removePassenger(){
        return passengers.remove(0);
    }


}
