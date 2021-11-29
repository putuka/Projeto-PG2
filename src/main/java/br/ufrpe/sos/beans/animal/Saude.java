package br.ufrpe.sos.beans.animal;

public class Saude {

    private String saude;

    public Saude(String saude) {
        this.saude = saude;
    }

    public String getSaude() {
        return saude;
    }

    public void setSaude(String saude) {
        this.saude = saude;
    }

    @Override
    public String toString() {
        return getSaude();
    }
}
