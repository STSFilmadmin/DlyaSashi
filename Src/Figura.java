package zoopark2;

public abstract class Figura {
    protected double diametr;
    protected double vusota;

    public Figura(double diametr, double vusota) {
        this.diametr = diametr;
        this.vusota = vusota;
    }

    public abstract void ObchuslutuObyembaba();
}
