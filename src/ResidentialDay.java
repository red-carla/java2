import Activities.Activity;
import Activities.Game.Game;
import Visitor.Visitor;

import java.util.ArrayList;

public class ResidentialDay {
    ArrayList<Visitor> visitors;
    ArrayList<Activity> activities;
    ArrayList<Activity> residentialActivities;

    public ResidentialDay() {
        this.visitors = new ArrayList<Visitor>();
        this.activities = new ArrayList<Activity>();
        this.residentialActivities = new ArrayList<Activity>();
    }

    public void addVisitors(Visitor newVisitor) {
        visitors.add(newVisitor);

    }

    public void addActivity(Activity newActivity) {
        activities.add(newActivity);

    }

    public ArrayList<Activity> getActivities() {

        for (Activity a : activities) {
            if (a instanceof Game && a.isCompatibleResidentialDay() == true)

                residentialActivities.add(a);
        }
        return residentialActivities;
    }
}
