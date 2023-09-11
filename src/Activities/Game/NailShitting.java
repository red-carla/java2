package Activities.Game;

import Visitor.Visitor;
import Exception.VisitorCanNotParticipateException;

import java.util.ArrayList;

public class NailShitting extends Game {
    ArrayList<Visitor> canParticipate = new ArrayList<Visitor>();

    @Override
    public ArrayList<Visitor> canParticipate(ArrayList<Visitor> visitors) throws VisitorCanNotParticipateException {

        for (Visitor v : visitors) {
            if (v.height >= 1.73) {
                canParticipate.add(v);
            } else {
                throw new VisitorCanNotParticipateException();
            }
        }
        return canParticipate;
    }

    @Override
    public boolean isCompatibleResidentialDay() {
        return false;
    }

    @Override
    void changeStatus() {
        for (Visitor v : canParticipate) {
            v.funFactor += 0.5;
            v.backpainFactor += 0.8;
        }

    }
}
