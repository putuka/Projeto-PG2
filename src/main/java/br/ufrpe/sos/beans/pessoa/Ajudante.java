package br.ufrpe.sos.beans.pessoa;

import java.time.LocalDateTime;
import java.util.Objects;

public class Ajudante extends Pessoa {
    private TipoServico tipoServico;
    private double valor;

    public Ajudante(String nome, String telefone, String cpf, LocalDateTime dataNascimento, Endereco endereco, TipoServico tipoServico, double valor) {
        super(nome, telefone, cpf, dataNascimento, endereco);
        this.tipoServico = tipoServico;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ajudante{" + super.toString() +
                ",tipoServico=" + tipoServico +
                ", valor=" + valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ajudante)) return false;
        if (!super.equals(o)) return false;

        Ajudante ajudante = (Ajudante) o;

        if (Double.compare(ajudante.valor, valor) != 0) return false;
        return Objects.equals(tipoServico, ajudante.tipoServico);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (tipoServico != null ? tipoServico.hashCode() : 0);
        temp = Double.doubleToLongBits(valor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

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
}
