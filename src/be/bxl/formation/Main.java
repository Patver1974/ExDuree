package be.bxl.formation;

public class Main {

    public static void main(String[] args) {
Duree d1 = new Duree(86400);
Duree d2 = new Duree(1);
d1.GetDureee();
System.out.println("secondes" + d1.GetTotalSeconde());
        d2.GetDureee();
        System.out.println("secondes" + d2.GetTotalSeconde());

d1.AddDuree(d2);
d1.GetDureee();
        System.out.println("secondes" + d2.GetTotalSeconde());
d1.SubDuree(d2);
        d1.SubDuree(d2);
        d1.GetDureee();



    }
}
