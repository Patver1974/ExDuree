package be.bxl.formation;

public class Duree {
    private int jours;
    private int heures;
    private int minutes;
    private int secondes;
    private int secondesTotal;
    private int temporaile;


    public Duree(int nbSecondes) {
        temporaile = 60 * 60 * 24;
        this.jours = nbSecondes / temporaile;
        nbSecondes = nbSecondes - (jours * temporaile);
        temporaile = 60 * 60;
        this.heures = nbSecondes / temporaile;
        nbSecondes = nbSecondes - (heures * temporaile);
        temporaile = 60;
        this.minutes = nbSecondes / temporaile;
        secondes = nbSecondes - (this.minutes * temporaile);


        nbSecondes = nbSecondes - (jours * temporaile);
    }

    public Duree(int jour, int heures, int minutes, int nbSecondes) {
        this.jours = jour;
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = nbSecondes;
    }

    public void GetDureee() {
        System.out.printf("%s jours %s heures %s minutes %s secondes ", String.valueOf(this.jours), String.valueOf(this.heures), String.valueOf(this.minutes), String.valueOf(this.secondes));
        System.out.println("");
    }

    public int GetTotalSeconde() {
        secondesTotal = (((((this.jours * 24) + this.heures) * 60) + this.minutes) * 60 + this.secondes);
        return secondesTotal;
    }


    public void SubDuree(Duree aSoustraire) {
        int nbSecondes;
        if (this.GetTotalSeconde() > aSoustraire.GetTotalSeconde()) {
            nbSecondes = this.GetTotalSeconde() - aSoustraire.GetTotalSeconde();



            temporaile = 60 * 60 * 24;
            this.jours = nbSecondes / temporaile;
            nbSecondes = nbSecondes - (jours * temporaile);
            temporaile = 60 * 60;
            this.heures = nbSecondes / temporaile;
            nbSecondes = nbSecondes - (heures * temporaile);
            temporaile = 60;
            this.minutes = nbSecondes / temporaile;
            secondes = nbSecondes - (this.minutes * temporaile);


            nbSecondes = nbSecondes - (jours * temporaile);
        }
    }

    public void AddDuree(Duree aAjouter) {
        int nbSecondes;

        nbSecondes = this.GetTotalSeconde() + aAjouter.GetTotalSeconde();

        temporaile = 60 * 60 * 24;
        this.jours = nbSecondes / temporaile;
        nbSecondes = nbSecondes - (jours * temporaile);
        temporaile = 60 * 60;
        this.heures = nbSecondes / temporaile;
        nbSecondes = nbSecondes - (heures * temporaile);
        temporaile = 60;
        this.minutes = nbSecondes / temporaile;
        secondes = nbSecondes - (this.minutes * temporaile);


        nbSecondes = nbSecondes - (jours * temporaile);


}}
