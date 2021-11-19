package br.ufrpe.sos.beans.pessoa;

import java.time.LocalDate;
import java.util.Objects;

public class Voluntario{
    private Pessoa pessoa;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voluntario that = (Voluntario) o;
        return Objects.equals(pessoa, that.pessoa) && tipoServico == that.tipoServico && Objects.equals(dataEntrada, that.dataEntrada);
    }

    @Override
    public String toString() {
        return "Voluntario{" +
                "pessoa=" + pessoa +
                ", tipoServico=" + tipoServico +
                ", dataEntrada=" + dataEntrada +
                '}';
    }
}
