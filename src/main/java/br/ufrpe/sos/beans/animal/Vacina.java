package br.ufrpe.sos.beans.animal;

public class Vacina {

    private String tipo;

    public Vacina(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return getTipo();
    }
}
