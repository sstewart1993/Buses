import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;
    private Person person1;
    private Person person2;

    @Before
    public void before(){
        busStop = new BusStop("Glasgow");
        person = new Person();
        person1 = new Person();
        person2 = new Person();
    }

    @Test
    public void busStopName(){
        assertEquals("Glasgow", this.busStop.getName());
    }

    @Test
    public void checkHowManyInQueue(){
        assertEquals(0, busStop.queueLength());
    }

    @Test
    public void addToQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.queueLength());
    }

    @Test
    public void removeFromQueue(){
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(0, busStop.queueLength());

    }





}
