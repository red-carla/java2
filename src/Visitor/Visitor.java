package Visitor;


public class Visitor {
    protected String name;
    protected Sex sex;
    public int age;
    public double height;
    public boolean hasVoice;
    public double funFactor;
    public double sicknessFactor;
    public double backpainFactor;
    public int numOfBeers;
    public VisitorStatus visitorStatus;

    public Visitor(String name, Sex sex, int age, double height, boolean hasVoice, double funFactor, double sicknessFactor, double backpainFactor, int numOfBeers) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.hasVoice = hasVoice;
        this.funFactor = funFactor;
        this.sicknessFactor = sicknessFactor;
        this.backpainFactor = backpainFactor;
        this.numOfBeers = numOfBeers;

    }

    public int getNumOfBeers() {
        return numOfBeers;
    }

    public VisitorStatus getVisitorStatus() {
        if ((funFactor >= 0.8 && funFactor <= 1.0) && (sicknessFactor >= 0.0 && sicknessFactor <= 0.3) && (backpainFactor >= 0.0 && backpainFactor <= 0.5)) {
            visitorStatus = VisitorStatus.HAPPY;
        } else if ((funFactor >= 0.4 && funFactor <= 0.7) && (sicknessFactor >= 0.3 && sicknessFactor <= 0.7) && (backpainFactor >= 0.5 && backpainFactor <= 0.6)) {
            visitorStatus = VisitorStatus.NEUTRAL;
        } else if ((funFactor >= 0.0 && funFactor <= 0.7) && (sicknessFactor >= 0.8 && sicknessFactor <= 1.0) && (backpainFactor >= 0.7 && backpainFactor <= 1.0)) {
            visitorStatus = VisitorStatus.UNHAPPY;
        }
        return visitorStatus;
    }
}
