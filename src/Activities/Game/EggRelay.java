package Activities.Game;

import Visitor.Visitor;
import Exception.VisitorCanNotParticipateException;

import java.util.ArrayList;

public class EggRelay extends Game {
    ArrayList<Visitor> canParticipate = new ArrayList<Visitor>();

    @Override
    public ArrayList<Visitor> canParticipate(ArrayList<Visitor> visitors) throws VisitorCanNotParticipateException {

        for (Visitor v : visitors) {
            if (v.sicknessFactor <= 0.8) {
                canParticipate.add(v);
            } else {
                throw new VisitorCanNotParticipateException();
            }
        }
        return canParticipate;

    }

    @Override
    public boolean isCompatibleResidentialDay() {
        if (canParticipate.size() > 3) {
            return false;
        } else {
            return true;
        }
    }

    void changeStatus() {
        for (Visitor v : canParticipate) {
            v.funFactor += 0.4;
            v.sicknessFactor += 0.2;
        }

    }

}
