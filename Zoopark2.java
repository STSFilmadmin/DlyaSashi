package zoopark2;

public class Zoopark2 {

    public static void main(String[] args) {
       // Figura t = new Figura(1.0, 2.0);
        Konys s = new Konys(10.0, 4.0);
        Chulindr h = new Chulindr(10.0, 5.0);
        Figura p = new Chulindr(21, 20);
        Figura dudu = new Chulindr(15, 25);
        

       // PokazatuTvarunu(t);
        Obyem(s);
        Obyem(h);
        Obyem(p);
        Obyem(dudu);
    }

    public static void Obyem(Figura figura2) {
        
        figura2.ObchuslutuObyembaba();
    }
}
