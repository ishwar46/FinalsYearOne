package Practice;
//Create a class named Simple Intrest which has all the entities
//required to calculate the SI as its properties along with a method
//to calculate it.
class SimpleIntrest {
    double principle;
    double rate;
    double time;
    double si;
    public SimpleIntrest(double principle, double rate, double time) {
        this.principle = principle;
        this.rate = rate;
        this.time = time;
    }
    public double getSi() {
        return si;
    }
    public void setSi(double si) {
        this.si = si;
    }
    public double getPrinciple() {
        return principle;
    }
    public void setPrinciple(double principle) {
        this.principle = principle;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getTime() {
        return time;
    }
    public void setTime(double time) {
        this.time = time;
    }
    public void calculateSi() {
        this.si = (this.principle * this.rate * this.time) / 100;
    }
}
public class SIMain {
    public static void main(String[] args) {
        SimpleIntrest sim = new SimpleIntrest(1000, 2, 1);
        sim.setPrinciple(1000);
        sim.setRate(2);
        sim.setTime(1);
        sim.calculateSi();
        System.out.println(sim.getSi());
        System.out.println(sim.getPrinciple());
        System.out.println(sim.getRate());
        System.out.println(sim.getTime());

    }
}
