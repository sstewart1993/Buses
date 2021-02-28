import java.lang.reflect.Array;
import java.util.ArrayList;

public class Buses {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Buses(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
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

    public int passengerCount(){
        return this.passengers.size();
    }


    public void addPerson(Person person) {
        if(this.passengerCount() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePerson(Person person) {
        this.passengers.remove(person);
    }

    public void pickUp(BusStop busStop){
        if(this.passengerCount() < this.capacity && busStop.queueLength() > 0){
            Person personRemoved = busStop.removeFromQueue();
            this.addPerson(personRemoved);
        }
    }
}
