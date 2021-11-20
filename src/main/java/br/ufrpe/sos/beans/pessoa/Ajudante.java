package br.ufrpe.sos.beans.pessoa;

import java.util.Objects;

public class Ajudante extends Pessoa{
    private TipoServico tipoServico;
    private double valor;



    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ajudante ajudante = (Ajudante) o;
        return Double.compare(ajudante.valor, valor) == 0 && tipoServico == ajudante.tipoServico;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Ajudante{" +
                "pessoa=" + super.toString() +
                ", tipoServico=" + tipoServico +
                ", valor=" + valor +
                '}';
    }
}
