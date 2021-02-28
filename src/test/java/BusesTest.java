import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusesTest {
    private Buses buses;
    private Person person;
    private Person person1;
    private Person person2;


    @Before
    public void before() {
        buses = new Buses("Glasgow", 2);
        person = new Person();
        person1 = new Person();
        person2 = new Person();
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

}
