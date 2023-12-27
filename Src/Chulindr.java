package zoopark2;

public class Chulindr extends Figura {

    public Chulindr(double diametr, double vusota) {
        super(diametr, vusota);
    }
//TODO а тут пишу коментар що мені треба щось там ще дописати чи реалізувати ....
    @Override
    public void ObchuslutuObyembaba() {
        double obyem = Math.PI * Math.pow(diametr / 2, 2) * vusota;
        System.out.println("Об'єм циліндра: " + obyem);
    }
}
