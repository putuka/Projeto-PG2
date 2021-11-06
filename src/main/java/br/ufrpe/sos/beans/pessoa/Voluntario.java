package br.ufrpe.sos.beans.pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Voluntario extends Pessoa {
    private TipoServico tipoServico;
    private LocalDate dataEntrada;

    public Voluntario(String nome, String telefone, String cpf, LocalDateTime dataNascimento, Endereco endereco, TipoServico tipoServico, LocalDate dataEntrada) {
        super(nome, telefone, cpf, dataNascimento, endereco);
        this.tipoServico = tipoServico;
        this.dataEntrada = dataEntrada;
    }

    @Override
    public String toString() {
        return "Voluntario{" + super.toString() +
                ",tipoServico=" + tipoServico +
                ", dataEntrada=" + dataEntrada +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Voluntario)) return false;
        if (!super.equals(o)) return false;

        Voluntario that = (Voluntario) o;

        if (getTipoServico() != that.getTipoServico()) return false;
        return getDataEntrada() != null ? getDataEntrada().equals(that.getDataEntrada()) : that.getDataEntrada() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getTipoServico() != null ? getTipoServico().hashCode() : 0);
        result = 31 * result + (getDataEntrada() != null ? getDataEntrada().hashCode() : 0);
        return result;
    }

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
}
