import java.util.ArrayList;

public class Buses {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Buses(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Person> getPassengers() {
        return passengers;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPassengers(ArrayList<Person> passengers) {
        this.passengers = passengers;
    }










}
