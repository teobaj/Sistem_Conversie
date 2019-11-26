package conversie;

public class InfoConversie {
    private double valoareDeConvertit;
    private double valoareConvertita;
    private double constantaDeCoversie;
    private String unitateDin;
    private String unitateCatre;

    public double getConstantaDeCoversie() {
        return constantaDeCoversie;
    }

    public double getValoareConvertita() {
        return valoareConvertita;
    }

    public double getValoareDeConvertit() {
        return valoareDeConvertit;
    }

    public String getUnitateDin() {
        return unitateDin;
    }

    public String getUnitateCatre() {
        return unitateCatre;
    }

    public void setConstantaDeCoversie(double constantaDeCoversie) {
        this.constantaDeCoversie = constantaDeCoversie;
    }

    public void setUnitateCatre(String unitateCatre) {
        this.unitateCatre = unitateCatre;
    }

    public void setUnitateDin(String unitateDin) {
        this.unitateDin = unitateDin;
    }

    public void setValoareConvertita(double valoareConvertita) {
        this.valoareConvertita = valoareConvertita;
    }

    public void setValoareDeConvertit(double valoareDeConvertit) {
        this.valoareDeConvertit = valoareDeConvertit;
    }
}
