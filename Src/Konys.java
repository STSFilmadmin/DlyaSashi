package zoopark2;

public class Konys extends Figura {

	public Konys(double diametr, double vusota) {
		super(diametr, vusota);
	}

	@Override
	public void ObchuslutuObyembaba() {
		double obyem = (1.0 / 3.0) * Math.PI * Math.pow(diametr / 2, 2) * vusota;
		System.out.println("Об'єм конуса: " + obyem);
	}
}
