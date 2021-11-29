package br.ufrpe.sos.beans.pessoa;

public class Tributo {

    private String tributo;

    public Tributo(String tributo) {
        this.tributo = tributo;
    }

    public String getTributo() {
        return tributo;
    }

    public void setTributo(String tributo) {
        this.tributo = tributo;
    }

    @Override
    public String toString() {
        return getTributo();
    }
}
