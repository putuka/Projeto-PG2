package br.ufrpe.sos.beans.pessoa;

import java.time.LocalDate;
import java.util.Objects;

public class Voluntario extends Pessoa{
    private TipoServico tipoServico;
    private LocalDate dataEntrada;

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Voluntario that = (Voluntario) o;
        return tipoServico == that.tipoServico && Objects.equals(dataEntrada, that.dataEntrada);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Voluntario{" +
                "pessoa=" + super.toString() +
                ", tipoServico=" + tipoServico +
                ", dataEntrada=" + dataEntrada +
                '}';
    }
}
