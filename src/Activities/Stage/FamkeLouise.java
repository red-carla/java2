package Activities.Stage;

import Visitor.Visitor;
import Exception.VisitorCanNotParticipateException;

import java.util.ArrayList;

public class FamkeLouise extends Stage {
    ArrayList<Visitor> canParticipate = new ArrayList<Visitor>();
    @Override
    public ArrayList<Visitor> canParticipate(ArrayList<Visitor> visitors) throws VisitorCanNotParticipateException {
        return null;
    }

    @Override
    public boolean isCompatibleResidentialDay() {
        return false;
    }

    @Override
    void changeStatus() {
        for (Visitor v: canParticipate){
            v.funFactor -= 0.5;
        }
    }

    @Override
    void drinkBeer() {
        for (Visitor v: canParticipate){
            v.sicknessFactor += 0.4;
            v.hasVoice = false;
        }
    }
}
