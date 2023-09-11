package Activities.Game;

import Visitor.Visitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Visitor.Sex;
import Exception.VisitorCanNotParticipateException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EggRelayTest {

    @BeforeEach
    void setUp() {
        EggRelay newEgg = new EggRelay();
        Visitor visitorTest1 = new Visitor("Carla Redmond", Sex.FEMALE, 23, 1.3, true, 0.9,1.0, 0.0, 5);
        ArrayList<Visitor> visitors = new ArrayList<Visitor>();
        visitors.add(visitorTest1);

    }

    @Test
    void canParticipate_shouldThrowException() {
        assertThrows(VisitorCanNotParticipateException.class, () -> new Visitor("Carla Redmond", Sex.FEMALE, 23, 1.3, true, 0.9,1.0, 0.0, 5));

    }
}