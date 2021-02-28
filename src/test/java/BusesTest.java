import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusesTest {
    private Buses buses;
    private Person person;
    private Person person1;
    private Person person2;
    private BusStop busStop;


    @Before
    public void before() {
        buses = new Buses("Glasgow", 2);
        person = new Person();
        person1 = new Person();
        person2 = new Person();
        busStop = new BusStop("Glasgow");
        busStop.addToQueue(person);
    }

    @Test
    public void checkDestination(){
        assertEquals("Glasgow", buses.getDestination());
    }

    @Test
    public void checkCapacity(){
        assertEquals(2, buses.getCapacity());
    }

    @Test
    public void checkHowManyPeopleOnTheBus(){
        assertEquals(0, buses.passengerCount());
    }

    @Test
    public void addPersonToBus(){
        buses.addPerson(person);
        assertEquals(1, buses.passengerCount());
    }

    @Test
    public void personGetsOffBus(){
        buses.addPerson(person);
        buses.removePerson(person);
        assertEquals(0, buses.passengerCount());
    }

    @Test
    public void busIsTooFull(){
        buses.addPerson(person);
        buses.addPerson(person1);
        buses.addPerson(person2);
        assertEquals(2, buses.passengerCount());
    }

    @Test
    public void canPickUpFromStop(){
        buses.pickUp(busStop);
        assertEquals(1, buses.passengerCount());
        assertEquals(0, busStop.queueLength());
    }

    @Test
    public void cantPickUpFromStop(){
        buses.addPerson(person);
        buses.addPerson(person);
        buses.addPerson(person);
        buses.pickUp(busStop);
        assertEquals(2, buses.passengerCount());
        assertEquals(1, busStop.queueLength());
    }

}
