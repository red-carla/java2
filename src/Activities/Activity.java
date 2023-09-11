package Activities;

import Visitor.Visitor;
import Exception.VisitorCanNotParticipateException;

import java.util.ArrayList;

public interface Activity {
    ArrayList<Visitor> canParticipate = new ArrayList<Visitor>();

    ArrayList<Visitor> canParticipate(ArrayList<Visitor> visitors) throws VisitorCanNotParticipateException;

    boolean isCompatibleResidentialDay();

}
