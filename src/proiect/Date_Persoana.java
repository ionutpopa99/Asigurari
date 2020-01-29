
package proiect;

/**
 *
 * @author Popa Ionut
 */
public class Date_Persoana {

    public Date_Persoana(long CNP, String NUME, String PRENUME, String LOCALITATE, String STRADA, int NUMAR) {
        this.CNP = CNP;
        this.NUME = NUME;
        this.PRENUME = PRENUME;
        this.LOCALITATE = LOCALITATE;
        this.STRADA = STRADA;
        this.NUMAR = NUMAR;
    }

    public long getCNP() {
        return CNP;
    }

    public String getNUME() {
        return NUME;
    }

    public String getPRENUME() {
        return PRENUME;
    }

    public String getLOCALITATE() {
        return LOCALITATE;
    }

    public String getSTRADA() {
        return STRADA;
    }

    public int getNUMAR() {
        return NUMAR;
    }
    long CNP;
    String NUME;
    String PRENUME;
    String LOCALITATE;
    String STRADA;
    int NUMAR;
    
}
