import Visitor.Visitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Visitor.Sex;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KingsDayTest {
    @BeforeEach
    void setUp() {
        KingsDay kingsDay = new KingsDay();
        ArrayList<Visitor> visitors = new ArrayList<Visitor>();
        Visitor visitorTest1 = new Visitor("Carla Redmond", Sex.FEMALE, 23, 1.3, true, 0.9, 0.0, 0.0, 5);
        visitorTest1.getVisitorStatus();
        visitors.add(visitorTest1);

    }

    @Test
    void getHappyPersons() {
        ArrayList<Visitor> happyPersons = new ArrayList<Visitor>();
        assertEquals(1, happyPersons.size());
    }
}