package proiect;

import java.sql.Date;




public class Date_Asigurare {

    public Date_Asigurare(int NR_ASIG, String TIP_ASIG, float VALOARE_ASIG, float SUMA, Date DATA_PLATII) {
        this.NR_ASIG = NR_ASIG;
        this.TIP_ASIG = TIP_ASIG;
        this.VALOARE_ASIG = VALOARE_ASIG;
        this.SUMA = SUMA;
        this.DATA_PLATII = DATA_PLATII;
    }

    public int getNR_ASIG() {
        return NR_ASIG;
    }

    public String getTIP_ASIG() {
        return TIP_ASIG;
    }

    public float getVALOARE_ASIG() {
        return VALOARE_ASIG;
    }

    public float getSUMA() {
        return SUMA;
    }

    public Date getDATA_PLATII() {
        return DATA_PLATII;
    }
    int NR_ASIG;
    String TIP_ASIG;
    float VALOARE_ASIG;
    float SUMA;
    Date DATA_PLATII;
    
}
