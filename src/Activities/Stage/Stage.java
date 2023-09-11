package Activities.Stage;

import Activities.Activity;
import Visitor.Visitor;

import java.util.ArrayList;

public abstract class Stage implements Activity {
    int visitorCounter;

    abstract void drinkBeer();

    abstract void changeStatus();


}
