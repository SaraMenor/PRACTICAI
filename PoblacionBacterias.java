import java.util.Date;

public class PoblacionBacterias extends ExperimentoBacterias {
    public int numeroBacterias;

    public PoblacionBacterias(int numeroBacterias){
        super();
        this.numeroBacterias=numeroBacterias;
    }

    @Override
    public String toString() {
        return  super.toString();
    }

    public int getNumeroBacterias() {
        return numeroBacterias;
    }

    public void setNumeroBacterias(int numeroBacterias) {
        this.numeroBacterias = numeroBacterias;
    }
}