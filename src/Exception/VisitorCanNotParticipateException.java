package Exception;

public class VisitorCanNotParticipateException extends Exception {
    public VisitorCanNotParticipateException(){
        super("Visitor does not meet requirements");
    }
}
