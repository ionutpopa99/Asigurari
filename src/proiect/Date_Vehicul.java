package proiect;


public class Date_Vehicul {

    public Date_Vehicul(int NR_VEHICUL, String MARCA, String TIP, long SERIE, String CULOARE, float CAPACIT_CIL) {
        this.NR_VEHICUL = NR_VEHICUL;
        this.MARCA = MARCA;
        this.TIP = TIP;
        this.SERIE = SERIE;
        this.CULOARE = CULOARE;
        this.CAPACIT_CIL = CAPACIT_CIL;
    }

    public int getNR_VEHICUL() {
        return NR_VEHICUL;
    }

    public String getMARCA() {
        return MARCA;
    }

    public String getTIP() {
        return TIP;
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
    int NR_VEHICUL;
    String MARCA;
    String TIP;
    long SERIE;
    String CULOARE;
    float CAPACIT_CIL;
    
    
}
