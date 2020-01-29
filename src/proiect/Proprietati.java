
package proiect;

import java.sql.Date;


public class Proprietati {
    long CNP;
    String NUME;
    String PRENUME;
    String LOCALITATE;
    int NR_VEHICUL;
    String MARCA;
    long SERIE;
    String CULOARE;
    float CAPACIT_CIL;
    Date DATA_CUMPARARII;
    float PRET;

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

    public int getNR_VEHICUL() {
        return NR_VEHICUL;
    }

    public String getMARCA() {
        return MARCA;
    }

    public long getSERIE() {
        return SERIE;
    }

    public String getCULOARE() {
        return CULOARE;
    }

    public float getCAPACIT_CIL() {
        return CAPACIT_CIL;
    }

    public Date getDATA_CUMPARARII() {
        return DATA_CUMPARARII;
    }

    public float getPRET() {
        return PRET;
    }

    public Proprietati(long CNP, String NUME, String PRENUME, String LOCALITATE, int NR_VEHICUL, String MARCA, long SERIE, String CULOARE, float CAPACIT_CIL, Date DATA_CUMPARARII, float PRET) {
        this.CNP = CNP;
        this.NUME = NUME;
        this.PRENUME = PRENUME;
        this.LOCALITATE = LOCALITATE;
        this.NR_VEHICUL = NR_VEHICUL;
        this.MARCA = MARCA;
        this.SERIE = SERIE;
        this.CULOARE = CULOARE;
        this.CAPACIT_CIL = CAPACIT_CIL;
        this.DATA_CUMPARARII = DATA_CUMPARARII;
        this.PRET = PRET;
    }
}
