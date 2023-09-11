import Activities.Activity;
import Visitor.Visitor;
import Visitor.VisitorStatus;
import Exception.NoMoreVisitorsException;

import java.util.ArrayList;
import java.util.HashMap;

import static Activities.Activity.canParticipate;
import static java.lang.Integer.valueOf;

public class KingsDay {
    ArrayList<Visitor> visitors;
    ArrayList<Activity> activities;
    HashMap<Visitor, Integer> drinkingVisitors;
    ArrayList<Visitor> happyPersons;
    Integer numBeers;

    public KingsDay() {
        this.visitors = new ArrayList<Visitor>();
        this.activities = new ArrayList<Activity>();
        this.happyPersons = new ArrayList<Visitor>();
        this.drinkingVisitors = new HashMap<Visitor, Integer>();

    }

    public void addVisitors(Visitor newVisitor) throws NoMoreVisitorsException {
        if (visitors.size() < coronaKingsDay()) {
            visitors.add(newVisitor);
        } else {
            throw new NoMoreVisitorsException();
        }

    }

    public void addActivity(Activity newActivity) {
        activities.add(newActivity);

    }

    public void whoDoesWhat(Activity activity, HashMap<Visitor, Integer> drinkers) {
        for (Activity a : activities) {
            for (Visitor v : canParticipate) {
                int numDrinks = v.getNumOfBeers();
                Integer numBeers = valueOf(numDrinks);
                drinkingVisitors.put(v, numBeers);
            }
        }
        for (Activity act : activities) {
            System.out.println(drinkingVisitors);
        }
    }

    public ArrayList<Visitor> getHappyPersons() {
        for (Visitor v : visitors) {
            if (v.getVisitorStatus() == VisitorStatus.HAPPY) {
                happyPersons.add(v);
            }
        }
        return happyPersons;
    }

    public int coronaKingsDay() {
        int maxVisitors = (98 * 56) / 3;
        return maxVisitors;


    }
}
