package Activities.Stage;

import Visitor.Visitor;
import Exception.VisitorCanNotParticipateException;

import java.util.ArrayList;

public class MartinGarrix extends Stage{
    @Override

    public ArrayList<Visitor> canParticipate(ArrayList<Visitor> visitors) throws VisitorCanNotParticipateException {
        return canParticipate;
    }

    @Override
    public boolean isCompatibleResidentialDay() {
        return false;
    }

    @Override
    void drinkBeer() {
        for (Visitor v: canParticipate){
            v.sicknessFactor += 0.7;}
    }

    @Override
    void changeStatus() {
        for (Visitor v: canParticipate){
            if (v.age <= 35) {
                v.funFactor += 0.5;
            } else if (v.age > 35) {
                v.funFactor += 0.2;
            }

        }
    }
}
