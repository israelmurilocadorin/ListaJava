class Quadrilatero{
    private Ponto p1;
    private Ponto p2;
    private Ponto p3;
    private Ponto p4;

    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }


}

public class Main {

    public static void main(String[] args) {
        Ponto p1 = new Ponto(3.0, 5.0);
        Ponto p2 = new Ponto(5.0, 5.0);
        Ponto p3 = new Ponto(3.0, 3.0);
        Ponto p4 = new Ponto(5.0, 3.0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
